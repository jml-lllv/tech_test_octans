package com.test.octans.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.octans.model.UsuarioModel;
import com.test.octans.service.UsuarioService;

@RestController
@RequestMapping("/usuario/")
public class UsuarioREST {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("consultar")
	private ResponseEntity<List<UsuarioModel>> getAllUsuarios(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	
	@PostMapping("guardar")
	private ResponseEntity<UsuarioModel> saveUsuario(@RequestBody UsuarioModel usuario){
		
		try {
			UsuarioModel userSave = usuarioService.save(usuario);
			return ResponseEntity.created(new URI("/usuario/"+userSave.getNombre())).body(userSave);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
}
