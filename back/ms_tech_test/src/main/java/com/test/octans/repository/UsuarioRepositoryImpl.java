package com.test.octans.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.octans.entity.UsuarioEntity;
import com.test.octans.persistence.UsuarioPersistenceRepository;

@Repository
public class UsuarioRepositoryImpl implements UsuarioRepository {

	@Autowired
	private UsuarioPersistenceRepository usuarioPersistenceRepository;

	@Override
	public List<UsuarioEntity> findAll() {
		return usuarioPersistenceRepository.findAll();
	}

	@Override
	public <S extends UsuarioEntity> S save(S entity) {
		
		return usuarioPersistenceRepository.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		usuarioPersistenceRepository.deleteById(id);
	}

}
