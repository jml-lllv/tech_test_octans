package com.test.octans.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.test.octans.dto.RolDto;
import com.test.octans.entity.RolEntity;

@Mapper(componentModel="spring")
public interface RolMapper {
	
	@Mapping(source = "idRol", target = "idRol")
	@Mapping(source = "nombre", target = "nombre")
	RolDto toRolDto(RolEntity rolEntity);
	
	@InheritInverseConfiguration
	RolEntity toRolEntity(RolDto rolDto);
}
