package com.test.octans.rest;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping
	private ResponseEntity<List<UsuarioModel>> getAllUsuarios(){
		return ResponseEntity.ok(usuarioService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<UsuarioModel> saveUsuario(@RequestBody UsuarioModel usuario){
		
		try {
			UsuarioModel userSave = usuarioService.save(usuario);
			return ResponseEntity.created(new URI("/usuario/"+userSave.getNombre())).body(userSave);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteUsuario(@PathVariable("id") Long id){
		Boolean resp = false;
		usuarioService.deleteById(id);
		resp = true;
		
		return ResponseEntity.ok(resp);
	}
}
