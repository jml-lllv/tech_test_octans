package com.test.octans.dto;

import com.test.octans.entity.RolEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
	
	private Long idUsuario;
	
	private RolEntity rol;

	private String nombre;

	private String activo;
}
