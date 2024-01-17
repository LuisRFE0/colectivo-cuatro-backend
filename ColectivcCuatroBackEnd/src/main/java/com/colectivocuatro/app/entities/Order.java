package com.colectivocuatro.app.entities;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="ordenes")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) private int id_orden;
	
	@Column(name="id_cliente", nullable=false) private int idClient;
	@Column(name="fecha_compra", nullable=false) private Date orderDate;
	@Column(name="total") private double total;

}