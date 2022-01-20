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
import com.test.octans.model.UsuarioModel;
import com.test.octans.service.UsuarioService;

@RestController
@RequestMapping("/usuario/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("consultar")
	@CrossOrigin
	public ResponseEntity<List<UsuarioModel>> getAllUsuarios() {
		return ResponseEntity.ok(usuarioService.findAll());
	}

	@PostMapping("guardar")
	@CrossOrigin
	public ResponseEntity<UsuarioModel> saveUsuario(@RequestBody UsuarioDto usuario) {

		try {
			
			UsuarioModel usuarioModel = new UsuarioModel(usuario);
			
			return new ResponseEntity<>(usuarioService.save(usuarioModel), HttpStatus.OK);
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
