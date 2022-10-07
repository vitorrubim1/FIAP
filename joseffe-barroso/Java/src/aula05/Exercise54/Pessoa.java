package Exercise54;

public class Pessoa {
	public int id;
	public String nome;
	public Dependente dependente;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id, String nome, Dependente dependente) {
		this.id = id;
		this.nome = nome;
		this.dependente = dependente;
	}
	
	public void transformarNomeEmMaisculo () {
		this.nome = this.nome.toUpperCase();
	}
	
	public String exibirIdNome() {
		return "ID: " + this.id + " - Nome: " + this.nome;
	}
	
	public void mudarNome (String novoNome) {
		this.nome = novoNome;
	}
	
	public String exibirdDependente() {
		return "Nome: "  + this.dependente.nome + " - Idade: " + this.dependente.idade;
	}
}
