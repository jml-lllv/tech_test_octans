package com.test.octans.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.test.octans.dto.UsuarioDto;
import com.test.octans.entity.UsuarioEntity;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
	
	@Mapping(source = "idUsuario", target = "idUsuario")
	@Mapping(source = "rol", target = "rol")
	@Mapping(source = "nombre", target = "nombre")
	@Mapping(source = "activo", target = "activo")
	UsuarioDto toUsuarioDto(UsuarioEntity usuarioEntity);
	
	@InheritInverseConfiguration
	UsuarioEntity toUsuarioEntity(UsuarioDto usuarioDto);
}
