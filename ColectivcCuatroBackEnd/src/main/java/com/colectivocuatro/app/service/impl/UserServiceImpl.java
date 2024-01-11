package com.colectivocuatro.app.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colectivocuatro.app.entities.User;
import com.colectivocuatro.app.repository.UserRepository;
import com.colectivocuatro.app.service.UserService;

@Service

public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

	@Override
	public User updateUser(User user, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
