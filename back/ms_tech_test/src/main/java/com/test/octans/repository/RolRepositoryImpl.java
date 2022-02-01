package com.test.octans.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.octans.entity.RolEntity;
import com.test.octans.persistence.RolPersistenceRepository;

public class RolRepositoryImpl implements RolRepository {

	@Autowired
	private RolPersistenceRepository rolPersistenceRepository;

	@Override
	public List<RolEntity> findAll() {
		return rolPersistenceRepository.findAll();
	}

	@Override
	public <S extends RolEntity> S save(S entity) {
		return rolPersistenceRepository.save(entity);
	}

}
