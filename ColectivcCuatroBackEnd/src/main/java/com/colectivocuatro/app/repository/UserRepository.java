package com.colectivocuatro.app.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.colectivocuatro.app.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);

}
