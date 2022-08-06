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

import com.fatec.mr.model.Venda;
import com.fatec.mr.repository.VendaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/vendas")
public class VendaController {
	@Autowired
	private VendaRepository repository;
	
	@GetMapping("/all")
	public ResponseEntity<List<Venda>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<Venda> getById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/vender")
	public ResponseEntity<Venda> post(@RequestBody Venda venda){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(venda));
	}
	
	@PutMapping("/editar")
	public ResponseEntity<Venda> put(@RequestBody Venda venda){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(venda));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void  deletar(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
