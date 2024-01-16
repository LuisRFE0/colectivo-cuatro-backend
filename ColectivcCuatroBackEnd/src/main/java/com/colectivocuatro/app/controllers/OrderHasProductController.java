package com.colectivocuatro.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colectivocuatro.app.entities.OrderHasProduct;
import com.colectivocuatro.app.service.OrderHasProductService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/ohp")
public class OrderHasProductController {

	
	@Autowired
	OrderHasProductService orderHasProductService;
	
	@PostMapping("createOhp")
	OrderHasProduct createOhp(@RequestBody OrderHasProduct ohp) {
		OrderHasProduct newOhp = orderHasProductService.createOrderHasProduct(ohp);
		return newOhp;
		
	}
	
	
}
