package com.test.octans.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.octans.entity.UsuarioEntity;

@Repository
public interface UsuarioRepository {

	List<UsuarioEntity> findAll();

	<S extends UsuarioEntity> S save(S entity);

	void deleteById(Long id);
}
