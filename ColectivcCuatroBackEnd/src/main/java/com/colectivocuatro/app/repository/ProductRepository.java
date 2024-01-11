package com.colectivocuatro.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.colectivocuatro.app.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}

