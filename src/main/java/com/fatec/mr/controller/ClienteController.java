package com.fatec.mr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.mr.model.Cliente;
import com.fatec.mr.repository.ClienteRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Cliente>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{nome}")
	public ResponseEntity<List<Cliente>> getByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findByNome(nome));
	}
	
	@PostMapping
	public ResponseEntity<Cliente> post(@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
	}
	
	@PutMapping
	public ResponseEntity<Cliente> put(@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(cliente));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletar(@PathVariable Long id) {
		repository.deleteById(id);
	}
	

}
