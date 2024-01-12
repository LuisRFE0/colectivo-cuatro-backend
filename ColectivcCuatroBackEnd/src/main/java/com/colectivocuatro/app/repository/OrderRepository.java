package com.colectivocuatro.app.repository;

import org.springframework.data.repository.CrudRepository;
import com.colectivocuatro.app.entities.Order;


public interface OrderRepository extends CrudRepository<Order, Integer>{

}
