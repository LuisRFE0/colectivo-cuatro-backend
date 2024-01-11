package com.colectivocuatro.ColectivcCuatroBackEnd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.colectivocuatro.ColectivcCuatroBackEnd.entities.Product;
import com.colectivocuatro.ColectivcCuatroBackEnd.service.ProductService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/products")
public class ProductController {

	@Autowired
	ProductService productService;
	


}
