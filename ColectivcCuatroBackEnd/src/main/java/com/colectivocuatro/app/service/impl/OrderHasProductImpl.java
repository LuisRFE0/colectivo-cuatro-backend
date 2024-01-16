package com.colectivocuatro.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colectivocuatro.app.entities.OrderHasProduct;
import com.colectivocuatro.app.repository.OrderHasproductRepository;
import com.colectivocuatro.app.service.OrderHasProductService;

@Service
public class OrderHasProductImpl implements OrderHasProductService {

	
	@Autowired
	OrderHasproductRepository orderHasProductRepository;
	
	@Override
	public OrderHasProduct createOrderHasProduct(OrderHasProduct orderHasProduct) {

		OrderHasProduct newOrderHasProduct = orderHasProductRepository.save(orderHasProduct);
	
		return newOrderHasProduct;
	}

	
	
}
