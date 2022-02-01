package com.test.octans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.octans.entity.UsuarioEntity;
import com.test.octans.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<UsuarioEntity> findAll() {
		return usuarioRepository.findAll();
	}

	public <S extends UsuarioEntity> S save(S entity) {

		return usuarioRepository.save(entity);
	}

	public void deleteById(Long id) {

		this.usuarioRepository.deleteById(id);
	}
}
