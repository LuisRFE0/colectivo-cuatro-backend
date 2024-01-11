package com.colectivocuatro.app.service;

import com.colectivocuatro.app.entities.User;

public interface UserService {
	User createUser(User user);
	User getUserById (int id);
	User updateUser (User user , int id);
}
