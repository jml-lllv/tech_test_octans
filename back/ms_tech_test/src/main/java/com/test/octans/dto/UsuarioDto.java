package com.test.octans.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUsuario;

	@ManyToOne
	@JoinColumn(name = "id_rol")
	private RolDto rol;

	private String nombre;

	private String activo;
}
