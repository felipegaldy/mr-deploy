package com.fatec.mr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.mr.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByNome(String nome);
}
