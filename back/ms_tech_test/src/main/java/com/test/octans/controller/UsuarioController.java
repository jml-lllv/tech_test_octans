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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/usuario/")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private UsuarioMapper usuarioMapper;

	@GetMapping("consultar")
	@ApiOperation("Consultar todos los usuarios")
	@ApiResponse(code = 200, message = "OK")
	@CrossOrigin
	public ResponseEntity<List<UsuarioEntity>> getAllUsuarios() {
		try {
			return new ResponseEntity<>(usuarioService.findAll(), HttpStatus.OK);
		} catch (RestClientResponseException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("guardar")
	@ApiOperation("Guardar una entidad tipo usuario")
	@ApiResponse(code = 200, message = "OK")
	@CrossOrigin
	public ResponseEntity<UsuarioEntity> saveUsuario(@RequestBody UsuarioDto usuario) {
		try {
			UsuarioEntity usuarioEntity = usuarioMapper.toUsuarioEntity(usuario);
			return new ResponseEntity<>(usuarioService.save(usuarioEntity), HttpStatus.OK);
		} catch (RestClientResponseException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping(value = "delete/{id}")
	@ApiOperation("Eliminar un usuario por su Id")
	@ApiResponse(code = 200, message = "OK")
	@CrossOrigin
	public ResponseEntity<Boolean> deleteUsuario(@PathVariable("id") Long id) {

		try {
			usuarioService.deleteById(id);

			return new ResponseEntity<>(HttpStatus.OK);
		} catch (RestClientResponseException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
