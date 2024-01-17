package com.colectivocuatro.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colectivocuatro.app.entities.Role;
import com.colectivocuatro.app.service.RoleService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/roles")
public class RoleController {
	@Autowired
	RoleService roleService;
	
	
	@PostMapping
	ResponseEntity<Role> setRole(@RequestBody Role role){
		Role newRole = roleService.createRole(role);
		return new ResponseEntity<>( newRole, HttpStatus.CREATED);
	}
}
