package com.test.octans.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.test.octans.dto.UsuarioDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Usuario")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idUsuario;

	@ManyToOne
	@JoinColumn(name = "id_rol")
	private RolModel rol;

	private String nombre;

	private String activo;
	
	public UsuarioModel(UsuarioDto usuario) {
		super();
		this.idUsuario = usuario.getIdUsuario();
		this.rol = usuario.getRol();
		this.nombre = usuario.getNombre();
		this.activo = usuario.getActivo();
	}	
}
