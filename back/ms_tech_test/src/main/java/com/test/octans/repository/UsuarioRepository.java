package com.test.octans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.octans.dto.UsuarioDto;

public interface UsuarioRepository extends JpaRepository<UsuarioDto, Long>{

}
