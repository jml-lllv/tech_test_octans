package com.test.octans.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.octans.entity.RolEntity;

@Repository
public interface RolRepository {
	
	List<RolEntity> findAll();
	
	<S extends RolEntity> S save(S entity);
}
