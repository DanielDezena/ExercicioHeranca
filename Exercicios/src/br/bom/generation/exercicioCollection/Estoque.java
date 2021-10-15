package br.bom.generation.exercicioCollection;

public class Estoque {
	private String produto;
	private double preco;
	
	
	
	public Estoque( String produto, double preco) {
		super();
		this.produto = produto;
		this.preco = preco;
		
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public String toString() {
		
		return " Nome do produto: " + this.produto + " |||| Preço: " + this.preco + "R$";
	}
	

}
