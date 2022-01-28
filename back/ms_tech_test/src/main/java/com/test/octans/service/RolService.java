package com.test.octans.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.test.octans.entity.RolEntity;
import com.test.octans.repository.RolRepository;

@Service
public class RolService implements RolRepository {

	@Autowired
	private RolRepository rolRepository;

	@Override
	public List<RolEntity> findAll() {
		return rolRepository.findAll();
	}

	@Override
	public List<RolEntity> findAll(Sort sort) {
		return rolRepository.findAll(sort);
	}

	@Override
	public List<RolEntity> findAllById(Iterable<Long> ids) {
		return rolRepository.findAllById(ids);
	}

	@Override
	public <S extends RolEntity> List<S> saveAll(Iterable<S> entities) {
		return rolRepository.saveAll(entities);
	}

	@Override
	public void flush() {

	}

	@Override
	public <S extends RolEntity> S saveAndFlush(S entity) {
		return rolRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends RolEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return rolRepository.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<RolEntity> entities) {
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
	}

	@Override
	public void deleteAllInBatch() {
	}

	@SuppressWarnings("deprecation")
	@Override
	public RolEntity getOne(Long id) {
		return rolRepository.getOne(id);
	}

	@Override
	public RolEntity getById(Long id) {
		return rolRepository.getById(id);
	}

	@Override
	public <S extends RolEntity> List<S> findAll(Example<S> example) {
		return rolRepository.findAll(example);
	}

	@Override
	public <S extends RolEntity> List<S> findAll(Example<S> example, Sort sort) {
		return rolRepository.findAll(example, sort);
	}

	@Override
	public Page<RolEntity> findAll(Pageable pageable) {
		return rolRepository.findAll(pageable);
	}

	@Override
	public <S extends RolEntity> S save(S entity) {
		return rolRepository.save(entity);
	}

	@Override
	public Optional<RolEntity> findById(Long id) {
		return rolRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		return rolRepository.existsById(id);
	}

	@Override
	public long count() {
		return rolRepository.count();
	}

	@Override
	public void deleteById(Long id) {
	}

	@Override
	public void delete(RolEntity entity) {
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
	}

	@Override
	public void deleteAll(Iterable<? extends RolEntity> entities) {
	}

	@Override
	public void deleteAll() {
	}

	@Override
	public <S extends RolEntity> Optional<S> findOne(Example<S> example) {
		return rolRepository.findOne(example);
	}

	@Override
	public <S extends RolEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return rolRepository.findAll(example, pageable);
	}

	@Override
	public <S extends RolEntity> long count(Example<S> example) {
		return rolRepository.count(example);
	}

	@Override
	public <S extends RolEntity> boolean exists(Example<S> example) {
		return rolRepository.exists(example);
	}
}
