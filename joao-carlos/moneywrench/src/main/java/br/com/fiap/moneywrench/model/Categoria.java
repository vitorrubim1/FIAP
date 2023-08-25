package br.com.fiap.moneywrench.model;

import java.util.Objects;

public class Categoria {
    private Long id;
    private String nome;
    private String icone;

    public Categoria() {}

    public Categoria(String nome, String icone) {
        this.nome = nome;
        this.icone = icone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nome, categoria.nome) && Objects.equals(icone, categoria.icone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, icone);
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "nome='" + nome + '\'' +
                ", icone='" + icone + '\'' +
                '}';
    }
}
