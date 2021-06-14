package com.example.provaimc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.provaimc.model.Imc;

@RestController
@RequestMapping("/")
public class ImcController {
	
	@GetMapping
	public ResponseEntity<String> calcularImc(@RequestBody Imc imc) {
		new Imc(imc.getAltura(), imc.getPeso());
		return ResponseEntity.ok(imc.getResultado());
	}
}
