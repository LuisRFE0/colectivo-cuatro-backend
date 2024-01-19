package com.colectivocuatro.app.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.colectivocuatro.app.security.jwt.JWTAuthenticationFilter;
import com.colectivocuatro.app.security.jwt.JWTAuthorizationFilter;

import static org.springframework.security.config.Customizer.withDefaults;

import java.util.List;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	@Autowired
	PasswordEncoder passwordEncoder;
	@Autowired
	UserDetailsService userDetailsService;
	
	@Bean
	SecurityFilterChain filterChain(
			HttpSecurity http, 
			AuthenticationManager authManager,
			JWTAuthorizationFilter jwtAuthorizationFilter
			) throws Exception {
		
		// STEP 7.3 Crear el objeto y la configuración para jwtAuthenticationFilter
		JWTAuthenticationFilter jwtAuthenticationFilter = new JWTAuthenticationFilter();
		jwtAuthenticationFilter.setAuthenticationManager(  authManager );
		jwtAuthenticationFilter.setFilterProcessesUrl("/login/user");
		return http
				.cors( Customizer.withDefaults() )
				.authorizeHttpRequests( authorize -> authorize
						.requestMatchers( "/", "/index.html", "/assets/**" ).permitAll()
						.requestMatchers(HttpMethod.POST, "/api/v1/users/createUser").permitAll()
						.requestMatchers(HttpMethod.GET,"api/v1/products/getProducts").permitAll()
						.requestMatchers("/api/v2/users/**","api/v1/orders/**","api/v1/ohp/**","api/v1/orders/getIdOrder/*","/api/v1/products/**","api/v1/orders/**","/api/v1/products/createProduct").hasAnyRole("ADMIN", "CUSTOMER")
						.anyRequest().authenticated()
						)
				// STEP 7: Agregamos el filtro de autenticación del login
				// interceptar las solicitudes de autenticación y generamos el token en la respuesta
				.addFilter( jwtAuthenticationFilter )
				// STEP 8: Agregamos el filtro para las demas solicitudes verificando el token JWT
				// Interceptamos las solicitudes , extraemos y validamos el token
				// y autenticamos al usuario
				.addFilterBefore( jwtAuthorizationFilter  ,  UsernamePasswordAuthenticationFilter.class)
				/*
				 * no es necesario almacenar información de sesión en el servidor, 
				 * ya que toda la información necesaria para la autenticación 
				 * se encuentra en el token, y cada solicitud es autónoma.
				 */
				.sessionManagement(managment -> managment.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.csrf( csrf -> csrf.disable() )
				.httpBasic( withDefaults()  )
				.build();
		
	}
	
	@Bean
	AuthenticationManager authManager(HttpSecurity httpSecurity) throws Exception {
		AuthenticationManagerBuilder authManagerBuilder = httpSecurity
				.getSharedObject( AuthenticationManagerBuilder.class  );
		
		authManagerBuilder
		 .userDetailsService( userDetailsService ) 
		 .passwordEncoder( passwordEncoder );
		
		return authManagerBuilder.build();
	}
	
	// STEP 6: opcional, configurar los CORS en caso de que no funcione 
	// @CrossOrigin(origins = "*") en los controladores
	@Bean
	CorsConfigurationSource corsConfigurationSource() {
		CorsConfiguration configuration = new CorsConfiguration();
		configuration.setAllowedOrigins( List.of("http://127.0.0.1:5501", "https://colectivo-cuatro.onrender.com" ,"*") );
		configuration.setAllowedMethods( List.of("GET", "POST", "PUT", "DELETE") );
		configuration.setAllowedHeaders( List.of("Authorization","Content-Type") );
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", configuration);
		return source;
		
	}

}
