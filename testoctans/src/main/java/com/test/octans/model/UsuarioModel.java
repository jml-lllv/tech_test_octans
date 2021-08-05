package com.test.octans.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Usuario")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_usuario;
	@ManyToOne
	@JoinColumn (name="id_rol")
	private RolModel rol;
	private String nombre;
	private String activo;
	
	
	public UsuarioModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UsuarioModel(Long id_usuario, RolModel rol, String nombre, String activo) {
		super();
		this.id_usuario = id_usuario;
		this.rol = rol;
		this.nombre = nombre;
		this.activo = activo;
	}
	
	
	public Long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public RolModel getRol() {
		return rol;
	}
	public void setRol(RolModel rol) {
		this.rol = rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
}
