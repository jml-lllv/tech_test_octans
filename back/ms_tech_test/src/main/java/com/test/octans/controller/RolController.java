package com.test.octans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientResponseException;

import com.test.octans.dto.RolDto;
import com.test.octans.entity.RolEntity;
import com.test.octans.mapper.RolMapper;
import com.test.octans.service.RolService;

@RestController
@RequestMapping("/roles/")
public class RolController {

	@Autowired
	private RolService rolService;
	
	@Autowired
	private RolMapper rolMapper;

	@GetMapping("consultar")
	@CrossOrigin
	public ResponseEntity<List<RolEntity>> getAllRoles() {
		try {
			return ResponseEntity.ok(rolService.findAll());
		} catch (RestClientResponseException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@PostMapping("guardar")
	@CrossOrigin
	public ResponseEntity<RolEntity> saveUsuario(@RequestBody RolDto rol) {
		try {
			
			RolEntity rolEntity = rolMapper.toRolEntity(rol);
			
			return new ResponseEntity<>(rolService.save(rolEntity), HttpStatus.OK);
		} catch (RestClientResponseException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
