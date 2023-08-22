package com.itb.inf2gm.comercio.model;

public class Produto {

	private Long id;
	private String nome;
	private String descricao;
	private String codigoBarras;
	private double preco;
	
	// puclic: Acesso liberado para todas as classes.
	// private: Acesso permitido apenas para membros da propria classe 
	// Entende-se por membros (atributos e ou métodos)
	
	
	//metodos stter´s e getter são responsaveis em atribuir e recuperar informações
	//dos atributos "RESPECTIVAMENTE"
	
	public Produto(){
		
	}
	
	
	public Produto(Long id, String nome, String descricao, String codigoBarras, double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.codigoBarras = codigoBarras;
		this.preco = preco;
	}


	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigodeBarra) {
		this.codigoBarras = codigodeBarra;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
