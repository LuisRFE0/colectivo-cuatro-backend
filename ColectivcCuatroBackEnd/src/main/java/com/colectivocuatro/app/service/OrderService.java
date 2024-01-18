package com.colectivocuatro.app.service;

import java.util.List;

import com.colectivocuatro.app.entities.Order;

public interface OrderService {
	Order createOrder(Order order);
	Order findOrderById(int id);
	List<Order> getAllOrders();
	Order findByIdOrder(int id);
	Order updateOrder(Order order , int id);

}
