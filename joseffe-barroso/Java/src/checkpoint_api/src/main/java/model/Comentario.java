package model;

import java.util.HashMap;

public class Comentario {
    private int id;
    private String texto;
    private String usuario;

    public Comentario(String texto, String usuario) {
        this.id = (int) (Math.random() * 1000);
        this.texto = texto;
        this.usuario = usuario;
    }
    
    public Comentario() {
       
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    public int getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public static HashMap<Integer, Comentario> getComentariosHashMap(Comentario... comentarios) {
        HashMap<Integer, Comentario> map = new HashMap<Integer, Comentario>();
        for (Comentario comentario : comentarios) {
            map.put(comentario.getId(), comentario);
        }
        return map;
    }
}
