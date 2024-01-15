package com.colectivocuatro.app.service;

import java.util.Map;

import com.colectivocuatro.app.entities.User;

public interface UserService {
	User createUser(User user);
	User getUserById (int id);
	User updateUser (User user , int id);
	User findByEmailAndPassword(String email ,String password);
	User findByEmail(String email );
}
