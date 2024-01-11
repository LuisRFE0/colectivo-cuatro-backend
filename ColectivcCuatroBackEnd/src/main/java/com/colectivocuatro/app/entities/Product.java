package com.colectivocuatro.app.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="productos")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) private int id_producto;
	
	@Column(name="nombre", nullable=false, length=100) private String name;
	@Column(name="precio", nullable=false) private Double price;
	@Column(name="descripcion", nullable=false, length=400) private String description;
	@Column(name="stock", nullable=false) private int stock;
	@Column(name="id_categoria", nullable=false) private int category;
	@Column(name="url_imagen", nullable=false) private String urlImage;
}

