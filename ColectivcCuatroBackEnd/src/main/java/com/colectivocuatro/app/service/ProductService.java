package com.colectivocuatro.app.service;

import java.util.List;

import com.colectivocuatro.app.entities.Product;


public interface ProductService {
	Product createProduct(Product product);
	Product getProductById(int id);
	List<Product> getAllProducts();
	Product updateProduct(Product product, int id);
	void deleteProduct(int id);
}




