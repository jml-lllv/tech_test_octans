package com.test.octans.repository;

import java.util.List;

import com.test.octans.entity.UsuarioEntity;


public interface UsuarioRepository {

	List<UsuarioEntity> findAll();

	<S extends UsuarioEntity> S save(S entity);

	void deleteById(Long id);
}
