package com.test.octans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.octans.dto.RolDto;
import com.test.octans.service.RolService;

@RestController
@RequestMapping("/roles/")
public class RolController {

	@Autowired
	private RolService rolService;
	
	@GetMapping
	public ResponseEntity<List<RolDto>> getAllRoles(){
		return ResponseEntity.ok(rolService.findAll());
	}
}
