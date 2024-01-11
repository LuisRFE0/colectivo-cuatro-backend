package com.colectivocuatro.ColectivcCuatroBackEnd.repository;

import org.springframework.data.repository.CrudRepository;

import com.colectivocuatro.ColectivcCuatroBackEnd.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	
}

