package com.colectivocuatro.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.colectivocuatro.app.entities.Product;
import com.colectivocuatro.app.service.ProductService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("createProduct")
	Product setProduct(@RequestBody Product product) {	
		log.info("Se está creando un nuevo producto");
		log.info(product);
		Product newProduct = productService.createProduct(product);
		return newProduct;
	}

}
