package com.colectivocuatro.ColectivoCuatroBackEnd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colectivocuatro.ColectivcCuatroBackEnd.entities.Product;
import com.colectivocuatro.ColectivcCuatroBackEnd.repository.ProductRepository;
import com.colectivocuatro.ColectivcCuatroBackEnd.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		Product newProduct = productRepository.save( product );
		return newProduct;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Product product, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		
	}

}
