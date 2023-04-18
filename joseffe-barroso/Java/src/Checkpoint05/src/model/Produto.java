package model;

public class Produto {
	private String nome;
	private int quantidade;
	private double precoUnitario;
	
	public Produto() {}
	
	public Produto(String nome, int quantidade, double precoUnitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}
	
	 public String getNome() {
		return nome;
	}
	 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
}
