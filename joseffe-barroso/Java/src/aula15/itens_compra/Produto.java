package itens_compra;

public class Produto {
	private String nome;
	private int quantidade;
	private double preco_unitario;
	
	public Produto() {}

	public Produto(String nome, int quantidade, double preco_unitario) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco_unitario = preco_unitario;
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
	
	public double getPreco_unitario() {
		return preco_unitario;
	}
	
	public void setPreco_unitario(double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	
}
