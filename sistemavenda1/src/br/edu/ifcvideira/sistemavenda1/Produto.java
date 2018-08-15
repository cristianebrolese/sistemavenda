package br.edu.ifcvideira.sistemavenda1;

public class Produto {
	
	private String nome;
	private double precoDeCompra;
	private int quantidadeDeEstoque;
	
	public Produto(String nome, double precoDeCompra, int quantidadeDeEstoque){
		this.nome = nome;
		this.precoDeCompra = precoDeCompra;
		this.quantidadeDeEstoque = quantidadeDeEstoque;
	}

}
