package com.test.octans.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.test.octans.model.RolModel;
import com.test.octans.repository.RolRepository;

@Service
public class RolService implements RolRepository{
	
	@Autowired
	private RolRepository rolRepository;

	@Override
	public List<RolModel> findAll() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

	@Override
	public List<RolModel> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return rolRepository.findAll(sort);
	}

	@Override
	public List<RolModel> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return rolRepository.findAllById(ids);
	}

	@Override
	public <S extends RolModel> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return rolRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends RolModel> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return rolRepository.saveAndFlush(entity);
	}

	@Override
	public <S extends RolModel> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return rolRepository.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<RolModel> entities) {
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
	public RolModel getOne(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.getOne(id);
	}

	@Override
	public RolModel getById(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.getById(id);
	}

	@Override
	public <S extends RolModel> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return rolRepository.findAll(example);
	}

	@Override
	public <S extends RolModel> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return rolRepository.findAll(example, sort);
	}

	@Override
	public Page<RolModel> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return rolRepository.findAll(pageable);
	}

	@Override
	public <S extends RolModel> S save(S entity) {
		// TODO Auto-generated method stub
		return rolRepository.save(entity);
	}

	@Override
	public Optional<RolModel> findById(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.existsById(id);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return rolRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(RolModel entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends RolModel> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends RolModel> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return rolRepository.findOne(example);
	}

	@Override
	public <S extends RolModel> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return rolRepository.findAll(example, pageable);
	}

	@Override
	public <S extends RolModel> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return rolRepository.count(example);
	}

	@Override
	public <S extends RolModel> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return rolRepository.exists(example);
	}
}
