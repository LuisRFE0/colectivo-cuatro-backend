package com.colectivocuatro.app.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.colectivocuatro.app.entities.User;
import com.colectivocuatro.app.service.UserService;

import lombok.extern.log4j.Log4j2;
@Log4j2
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	
	@Autowired
	UserService userService;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		User existingUser = userService.findByEmail(email);
		return new UserDetailsImpl(existingUser);
	}

}
