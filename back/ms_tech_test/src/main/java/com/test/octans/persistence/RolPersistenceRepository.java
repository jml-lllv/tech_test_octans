package com.test.octans.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.octans.entity.RolEntity;

public interface RolPersistenceRepository extends JpaRepository<RolEntity, Long>{
	
}
