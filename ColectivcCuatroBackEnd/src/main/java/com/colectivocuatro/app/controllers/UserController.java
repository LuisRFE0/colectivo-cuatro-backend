package com.colectivocuatro.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colectivocuatro.app.entities.User;
import com.colectivocuatro.app.service.UserService;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("{id}")
	User getUser(@PathVariable("id") int id) {
		User user = userService.getUserById(id);
		return user;
	}

}
