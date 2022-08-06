package com.fatec.mr.model;

import java.time.LocalDate;

public class UserLogin {

	private Long id;
	
	private String nome;
	
	private String usuario;
	
	private String senha;

	private String foto;

	private LocalDate dataNascimento;
	
	private String token;

	public UserLogin(Long id, String nome, String usuario, String senha, String foto, LocalDate dataNascimento, String token) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.foto = foto;
		this.dataNascimento = dataNascimento;
		this.token = token;
	}
	
	public UserLogin() {	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
