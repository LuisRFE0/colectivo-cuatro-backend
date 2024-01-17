package com.colectivocuatro.app.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name="roles")
public class Role {
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	@Column(name="id_roles")
	private int id;
	@Column(name="rol")
	private String name;
	

}