package com.cleitontrentin.gerenciadorAcoes.Entites;

import java.io.Serializable;


public class Acoes implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nome;
	private double valorAcao;
	private int quantidade;
	
	
	public Acoes(String nome, double valorAcao, int quantidade) {
		super();
		this.nome = nome;
		this.valorAcao = valorAcao;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorAcao() {
		return valorAcao;
	}
	public void setValorAcao(double valorAcao) {
		this.valorAcao = valorAcao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}

