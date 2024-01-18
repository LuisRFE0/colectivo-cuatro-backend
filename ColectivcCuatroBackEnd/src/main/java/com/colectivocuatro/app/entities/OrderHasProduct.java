package com.colectivocuatro.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="ordenes_has_productos")
public class OrderHasProduct {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private int id;
	private int id_orden;
	private int id_producto;
	private String cantidad;
	
}
