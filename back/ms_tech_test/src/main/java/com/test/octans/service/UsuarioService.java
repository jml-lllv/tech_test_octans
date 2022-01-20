package com.test.octans.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.test.octans.dto.UsuarioDto;
import com.test.octans.repository.UsuarioRepository;

@Service
public class UsuarioService implements UsuarioRepository {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<UsuarioDto> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public List<UsuarioDto> findAll(Sort sort) {
		return usuarioRepository.findAll(sort);
	}

	@Override
	public List<UsuarioDto> findAllById(Iterable<Long> ids) {

		return usuarioRepository.findAllById(ids);
	}

	@Override
	public <S extends UsuarioDto> List<S> saveAll(Iterable<S> entities) {

		return usuarioRepository.saveAll(entities);
	}

	@Override
	public void flush() {

	}

	@Override
	public <S extends UsuarioDto> S saveAndFlush(S entity) {

		return usuarioRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends UsuarioDto> List<S> saveAllAndFlush(Iterable<S> entities) {

		return usuarioRepository.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<UsuarioDto> entities) {

	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {

	}

	@Override
	public void deleteAllInBatch() {

	}

	@SuppressWarnings("deprecation")
	@Override
	public UsuarioDto getOne(Long id) {

		return usuarioRepository.getOne(id);
	}

	@Override
	public UsuarioDto getById(Long id) {

		return usuarioRepository.getById(id);
	}

	@Override
	public <S extends UsuarioDto> List<S> findAll(Example<S> example) {

		return usuarioRepository.findAll(example);
	}

	@Override
	public <S extends UsuarioDto> List<S> findAll(Example<S> example, Sort sort) {

		return usuarioRepository.findAll(example, sort);
	}

	@Override
	public Page<UsuarioDto> findAll(Pageable pageable) {

		return usuarioRepository.findAll(pageable);
	}

	@Override
	public <S extends UsuarioDto> S save(S entity) {

		return usuarioRepository.saveAndFlush(entity);
	}

	@Override
	public Optional<UsuarioDto> findById(Long id) {

		return usuarioRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {

		return usuarioRepository.existsById(id);
	}

	@Override
	public long count() {

		return usuarioRepository.count();
	}

	@Override
	public void deleteById(Long id) {

		this.usuarioRepository.deleteById(id);
	}

	@Override
	public void delete(UsuarioDto entity) {

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {

	}

	@Override
	public void deleteAll(Iterable<? extends UsuarioDto> entities) {

	}

	@Override
	public void deleteAll() {
	}

	@Override
	public <S extends UsuarioDto> Optional<S> findOne(Example<S> example) {
		return usuarioRepository.findOne(example);
	}

	@Override
	public <S extends UsuarioDto> Page<S> findAll(Example<S> example, Pageable pageable) {
		return usuarioRepository.findAll(example, pageable);
	}

	@Override
	public <S extends UsuarioDto> long count(Example<S> example) {
		return usuarioRepository.count(example);
	}

	@Override
	public <S extends UsuarioDto> boolean exists(Example<S> example) {
		return usuarioRepository.exists(example);
	}

}
