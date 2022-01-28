package com.test.octans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientResponseException;

import com.test.octans.dto.UsuarioDto;
import com.test.octans.entity.UsuarioEntity;
import com.test.octans.mapper.UsuarioMapper;
import com.test.octans.service.UsuarioService;

@RestController
@RequestMapping("/usuario/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	private UsuarioMapper usuarioMapper;

	@GetMapping("consultar")
	@CrossOrigin
	public ResponseEntity<List<UsuarioEntity>> getAllUsuarios() {
		return ResponseEntity.ok(usuarioService.findAll());
	}

	@PostMapping("guardar")
	@CrossOrigin
	public ResponseEntity<UsuarioEntity> saveUsuario(@RequestBody UsuarioDto usuario) {

		try {
			
			UsuarioEntity usuarioEntity = usuarioMapper.toUsuarioEntity(usuario);
			
			return new ResponseEntity<>(usuarioService.save(usuarioEntity), HttpStatus.OK);
		} catch (RestClientResponseException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}

	@DeleteMapping(value = "delete/{id}")
	@CrossOrigin
	public ResponseEntity<Boolean> deleteUsuario(@PathVariable("id") Long id) {
		Boolean resp = false;
		usuarioService.deleteById(id);
		resp = true;

		return ResponseEntity.ok(resp);
	}
}
