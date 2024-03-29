package com.colectivocuatro.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colectivocuatro.app.repository.ProductRepository;
import com.colectivocuatro.app.service.ProductService;
import com.colectivocuatro.app.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {
		Product newProduct = productRepository.save(product);
		return newProduct;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> products = (List<Product>) productRepository.findAll();
		return products;
	}

	@Override
	public Product getProductById(int id) {

		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			return product.get();
		} else {
			throw new IllegalStateException("El producto no ha sido encontrado");

		}

	}

	@Override
	public Product updateProduct(Product product, int id) {

		Product existingProduct = getProductById(id);
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setDescription(product.getDescription());
		existingProduct.setStock(product.getStock());
		existingProduct.setCategory(product.getCategory());
		existingProduct.setUrlImage(product.getUrlImage());
		return createProduct(existingProduct);
	}

	@Override
	public void deleteProduct(int id) {
		
		Product existingProduct = getProductById(id);
		
		productRepository.delete(existingProduct);
		
	}

}
