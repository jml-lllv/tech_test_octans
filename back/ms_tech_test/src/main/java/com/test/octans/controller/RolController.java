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
import com.test.octans.service.RolService;

@RestController
@RequestMapping("/roles/")
public class RolController {

	@Autowired
	private RolService rolService;

	@GetMapping("consultar")
	@CrossOrigin
	public ResponseEntity<List<RolDto>> getAllRoles() {
		return ResponseEntity.ok(rolService.findAll());
	}

	@PostMapping("guardar")
	@CrossOrigin
	public ResponseEntity<RolDto> saveUsuario(@RequestBody RolDto rol) {
		try {
			return new ResponseEntity<>(rolService.save(rol), HttpStatus.OK);
		} catch (RestClientResponseException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}
}
