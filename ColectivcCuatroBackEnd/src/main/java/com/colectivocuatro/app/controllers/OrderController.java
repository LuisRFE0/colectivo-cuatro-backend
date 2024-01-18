package com.colectivocuatro.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colectivocuatro.app.entities.Order;
import com.colectivocuatro.app.service.OrderService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("api/v1/orders")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@PostMapping("createOrder")
	Order createOrder(@RequestBody Order order) {
		log.info("Se esta creando una orden");
		Order newOrder = orderService.createOrder(order);
		return newOrder;
	}
	
	@GetMapping("getIdOrder/{id}")
	Order getOrderId(@PathVariable("id") int id) {
		
		Order orderId = orderService.findByIdOrder(id);
		
		return orderId;
	
		
	}
	
	@GetMapping("getOrders")
	List<Order> getOrders() {
		List<Order> orders = orderService.getAllOrders();
		return orders;
	}
	
	@PutMapping("updateOrder/{id}")
	Order updateOrder( @RequestBody Order order ,@PathVariable("id") int id) {
		
		Order newOrder = orderService.updateOrder(order, id);
		
		return newOrder;
		
	}
	
}
