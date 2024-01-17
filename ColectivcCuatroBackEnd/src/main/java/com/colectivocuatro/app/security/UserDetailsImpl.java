package com.colectivocuatro.app.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.colectivocuatro.app.entities.User;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class UserDetailsImpl implements UserDetails {

private User user;
	
	public UserDetailsImpl( User user ) {
		this.user = user;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		List<GrantedAuthority> authorities = new ArrayList<>();	
		
		authorities.add(  new SimpleGrantedAuthority( "ROLE_"+this.user.getRole().getName() ));
		// authorities.add(  new SimpleGrantedAuthority( "ROLE_ADMIN" ));
		
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.user.getPassword();
	}

	@Override
	public String getUsername() {
		return this.user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public String fullName() {
		return this.user.getName() +  " " + this.user.getLastName();
	}

}
