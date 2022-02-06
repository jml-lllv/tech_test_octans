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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/roles/")
public class RolController {

	@Autowired
	private RolService rolService;

	@Autowired
	private RolMapper rolMapper;

	@GetMapping("consultar")
	@ApiOperation("Consultar todos los roles")
	@ApiResponse(code = 200, message = "OK")
	@CrossOrigin
	public ResponseEntity<List<RolEntity>> getAllRoles() {
		try {
			return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);
		} catch (RestClientResponseException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("guardar")
	@ApiOperation("Guardar una entidad tipo rol")
	@ApiResponse(code = 200, message = "OK")
	@CrossOrigin
	public ResponseEntity<RolEntity> saveRol(@RequestBody RolDto rol) {
		try {

			RolEntity rolEntity = rolMapper.toRolEntity(rol);

			return new ResponseEntity<>(rolService.save(rolEntity), HttpStatus.OK);
		} catch (RestClientResponseException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
