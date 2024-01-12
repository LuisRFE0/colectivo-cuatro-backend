package com.colectivocuatro.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="clientes")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) private int id_clientes;
	
	@Column(name="nombre", nullable=false, length=50) private String name;
	@Column(name="apellido", nullable=false, length=50) private String lastName;
	@Column(name="email", nullable=false, length=100, unique = true) private String email;
	@Column(name="password", nullable=false, length=500) private String password;
	@Column(name="direccion", nullable=true, length=200) private String adress;
	@Column(name="telefono", nullable=true, length=14) private String phone;
	private int id_rol;
}
