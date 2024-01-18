package com.colectivocuatro.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colectivocuatro.app.entities.Order;
import com.colectivocuatro.app.repository.OrderRepository;
import com.colectivocuatro.app.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired 
	OrderRepository orderRepository; 
	@Override
	public Order createOrder(Order order) {
		Order newOrder = orderRepository.save(order);
		return newOrder;
	}

	@Override
	public List<Order> getAllOrders() {
		List<Order> orders = (List<Order>) orderRepository.findAll();
		return orders;
	}

	@Override
	public Order findByIdOrder(int id) {
		Order order = orderRepository.findByIdOrder(id);
		return order;
	}



	@Override
	public Order findOrderById(int id) {
		
		Optional<Order> order = orderRepository.findById(id);
		
		return order.get();
	}

	@Override
	public Order updateOrder(Order order, int id) {
		Order existingOrder = findOrderById(id);
					
		existingOrder.setTotal(order.getTotal());
				return createOrder(existingOrder);
	}

}
