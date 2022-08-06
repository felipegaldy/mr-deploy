package com.fatec.mr.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.mr.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	public Optional<Usuario> findByUsuario(String usuario);
	//select * from tb_usuarios where ususario = "usuario";

	//Método criado para a Sessão de testes
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	
}