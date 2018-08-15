package br.edu.ifcvideira.sistemavenda1;

public class Main {
	
	public static void main(String[] args){
		Produto p1 = new Produto("Caneta", 1.00, 10);
		
		System.out.println("Nome do Produto: " + p1.getNome());
		p1.definePrecoDeVenda(30);
		
		System.out.println("Valor de Compra: " + p1.getPrecoDeCompra());
		p1.vende(8);
		
	}

}
