package com.colectivocuatro.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.colectivocuatro.app.entities.User;
import com.colectivocuatro.app.repository.UserRepository;
import com.colectivocuatro.app.service.UserService;

@Service

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public User createUser(User user) {
		
		try {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			User createUser = userRepository.save(user);
			return createUser;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
			
			
		}
		
		
	

	@Override
	public User getUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		if (user.isPresent()) {
			return user.get();
		}else {
			throw new IllegalStateException("El usuario no ha sido encontrado");
		}
	
	}

	
	
	
	
	
	@Override
	public User updateUser(User user, int id) {
		
		User existingUser = getUserById(id);

		existingUser.setName(user.getName());
		existingUser.setLastName(user.getLastName());
		existingUser.setAdress(user.getAdress());
		existingUser.setPhone(user.getPhone());
		return createUser(existingUser);
	}
	
	
	
	
	
	
	
	
	

	@Override
	public User findByEmailAndPassword(String email , String password) {
		
		Optional<User> user = userRepository.findByEmailAndPassword(email,password);
		
		if (user.isPresent()) {
			return user.get();
		}else {
			return null;
		}
		
	}

	@Override
	public User findByEmail(String email) {
		
		Optional<User> user = userRepository.findByEmail(email);
		if (user.isPresent()) {
			return user.get();
		}else {
			throw new IllegalStateException("User does not exist with email " + email);
		}
		
	}



}
