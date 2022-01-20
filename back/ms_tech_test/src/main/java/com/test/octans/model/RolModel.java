package com.test.octans.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.test.octans.dto.RolDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idRol;

	private String nombre;
	

	public RolModel(RolDto rol) {
		super();
		this.idRol = rol.getIdRol();
		this.nombre = rol.getNombre();
	}	
}
