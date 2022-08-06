package com.fatec.mr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.mr.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{
	
	
}
