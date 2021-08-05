package com.test.octans.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.octans.service.RolService;
import com.test.octans.model.RolModel;

@RestController
@RequestMapping("/rol/")
public class RolREST {

	@Autowired
	private RolService rolService;
	
	@GetMapping
	private ResponseEntity<List<RolModel>> getAllRoles(){
		return ResponseEntity.ok(rolService.findAll());
	}
}
