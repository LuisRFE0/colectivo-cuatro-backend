package com.colectivocuatro.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.colectivocuatro.app.entities.Order;


public interface OrderRepository extends CrudRepository<Order, Integer>{

	
	@Query(value = "SELECT * FROM ordenes WHERE id_cliente= :id_cliente ORDER BY id_orden DESC LIMIT 1", nativeQuery = true)
	Order findByIdOrder(@Param("id_cliente") int id);
	
	
	
}
