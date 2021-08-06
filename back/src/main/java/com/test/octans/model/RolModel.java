package com.test.octans.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Rol")
public class RolModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id_rol;
	String nombre;
	
	

	public RolModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RolModel(Long id_rol, String nombre) {
		super();
		this.id_rol = id_rol;
		this.nombre = nombre;
	}
	
	
	public Long getId_rol() {
		return id_rol;
	}
	public void setId_rol(Long id_rol) {
		this.id_rol = id_rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
