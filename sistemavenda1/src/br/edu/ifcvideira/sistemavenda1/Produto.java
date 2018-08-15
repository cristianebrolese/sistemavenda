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
	
	public void setQuantidadeDeEstoque(int valor){
		this.quantidadeDeEstoque = valor;
		}
	public int getQuantidadeDeEstoque(){
		return this.quantidadeDeEstoque;
		}
	
	public double definePrecoDeVenda(double porcentagem){
		return precoDeCompra += precoDeCompra*(porcentagem/100.0);
		}
	
	public void vende(int quantidade){
		if(this.quantidadeDeEstoque>=quantidade){
			this.quantidadeDeEstoque-=quantidade;
		}
		else{
			System.out.println("Quantidade requerida indisponivel no estoque");
		}
		}

}
