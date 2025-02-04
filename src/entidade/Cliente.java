package entidade;

import java.io.Serializable;

public class Cliente implements Serializable {

    // os tipos primitivos já são SERIALIZADOS
    private String nome;

    private int id;

    // os outros tipos precisam ser serializados


    public Cliente() {
    }

    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
