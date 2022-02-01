package com.test.octans.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.octans.entity.RolEntity;
import com.test.octans.repository.RolRepository;

@Service
public class RolService {

	@Autowired
	private RolRepository rolRepository;

	public List<RolEntity> findAll() {
		return rolRepository.findAll();
	}

	public <S extends RolEntity> S save(S entity) {
		return rolRepository.save(entity);
	}
}
