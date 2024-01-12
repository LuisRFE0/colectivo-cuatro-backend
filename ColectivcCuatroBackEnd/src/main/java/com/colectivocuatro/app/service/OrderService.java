package com.colectivocuatro.app.service;

import java.util.List;

import com.colectivocuatro.app.entities.Order;

public interface OrderService {
	Order createOrder(Order order);
	List<Order> getAllOrders();

}
