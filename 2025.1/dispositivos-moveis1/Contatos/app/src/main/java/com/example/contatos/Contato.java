package com.example.contatos;

import java.io.Serializable;

public class Contato implements Serializable {
    String nome;
    String telefone;
    String email;
    char categoria;
    public Contato(String nome, String telefone, String email,
                   char categoria) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.categoria = categoria;
    }

    public String toString() {
        return nome + " - " + telefone + " ("+categoria+")";
    }
}
