package model;

public class People {
	private String id;
	private String nome;
	private String email;
	private Address endereco;

	public Address getEndereco() {
		return endereco;
	}

	public void setEndereco(Address endereco) {
		this.endereco = endereco;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public People() {

	}

	public People(String id, String nome, int idade, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
	
	public String show() {
		return "\nID: " + this.id + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nEndereço:\n" + this.endereco.showAddress();
	}
}
