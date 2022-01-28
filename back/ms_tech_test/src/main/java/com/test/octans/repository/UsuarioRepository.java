package com.test.octans.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.octans.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

}
