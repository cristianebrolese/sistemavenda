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
	
	public void setNome(String nome){
		this.nome = nome;
		}
	public String getNome(){
		return this.nome;
		}
	
	public void setPrecoDeCompra(double valor){
		this.precoDeCompra = valor;
		}
	public double getPrecoDeCompra(){
		return this.precoDeCompra;
		}

}
