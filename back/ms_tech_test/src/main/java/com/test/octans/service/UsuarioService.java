package com.test.octans.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.test.octans.model.UsuarioModel;
import com.test.octans.repository.UsuarioRepository;

@Service
public class UsuarioService implements UsuarioRepository{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<UsuarioModel> findAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}

	@Override
	public List<UsuarioModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll(sort);
	}

	@Override
	public List<UsuarioModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return usuarioRepository.findAllById(ids);
	}

	@Override
	public <S extends UsuarioModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return usuarioRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UsuarioModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return usuarioRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends UsuarioModel> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return usuarioRepository.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<UsuarioModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public UsuarioModel getOne(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.getOne(id);
	}

	@Override
	public UsuarioModel getById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.getById(id);
	}

	@Override
	public <S extends UsuarioModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll(example);
	}

	@Override
	public <S extends UsuarioModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll(example, sort);
	}

	@Override
	public Page<UsuarioModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll(pageable);
	}

	@Override
	public <S extends UsuarioModel> S save(S entity) {
		// TODO Auto-generated method stub
		return usuarioRepository.saveAndFlush(entity);
	}

	@Override
	public Optional<UsuarioModel> findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return usuarioRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.usuarioRepository.deleteById(id);
	}

	@Override
	public void delete(UsuarioModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UsuarioModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends UsuarioModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return usuarioRepository.findOne(example);
	}

	@Override
	public <S extends UsuarioModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll(example, pageable);
	}

	@Override
	public <S extends UsuarioModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return usuarioRepository.count(example);
	}

	@Override
	public <S extends UsuarioModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return usuarioRepository.exists(example);
	}

}
