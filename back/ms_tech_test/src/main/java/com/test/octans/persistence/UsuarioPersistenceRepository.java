package com.test.octans.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.octans.entity.UsuarioEntity;

public interface UsuarioPersistenceRepository extends JpaRepository<UsuarioEntity, Long>{

}
