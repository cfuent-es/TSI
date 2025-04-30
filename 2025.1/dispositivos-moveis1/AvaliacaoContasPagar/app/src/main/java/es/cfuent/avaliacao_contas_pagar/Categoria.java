package es.cfuent.avaliacao_contas_pagar;

import java.io.Serializable;
import java.util.ArrayList;

public class Categoria implements Serializable {

    private String nome;
    private ArrayList<Conta> contas;

    public Categoria() {
        contas = new ArrayList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

}
