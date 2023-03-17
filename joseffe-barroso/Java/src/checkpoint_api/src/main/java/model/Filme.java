package model;

import java.util.HashMap;

public class Filme {
	private int id;
	private String nome;
    private String sinopse;
    private HashMap<Integer, Comentario> comentarios;

    public Filme(String nome, String sinopse, HashMap<Integer, Comentario> comentarios) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.comentarios = comentarios;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setComentarios(HashMap<Integer, Comentario> comentarios) {
		this.comentarios = comentarios;
	}
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public HashMap<Integer, Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.put(comentario.getId(), comentario);
    }

    public boolean excluirComentario(int idComentario) {
        return comentarios.remove(idComentario) != null;
    }
    
    public String getNomeComId() {
        return "ID: " + getId() + " - " + getNome();
    }
    
    public void exibirComentarios() {
        if (comentarios.isEmpty()) {
            System.out.println("\nNenhum comentário encontrado para o filme " + nome + ".");
        } else {
            System.out.println("\nComentários do filme " + nome + ":");
            for (Comentario comentario : comentarios.values()) {
                System.out.println("ID: " + comentario.getId() + " - " + comentario.getUsuario() + ": " + comentario.getTexto());
            }
        }
    }

}
