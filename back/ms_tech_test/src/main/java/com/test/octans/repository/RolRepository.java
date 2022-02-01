package com.test.octans.repository;

import java.util.List;

import com.test.octans.entity.RolEntity;

public interface RolRepository {
	
	List<RolEntity> findAll();
	
	<S extends RolEntity> S save(S entity);
}
