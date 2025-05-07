package es.cfuent.avaliacao_contas_pagar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

public class Categoria implements Serializable {

    private String nome;
    private LinkedList<Conta> contas;

    public Categoria() {
        contas = new LinkedList<>();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public LinkedList<Conta> getContas() {
        return contas;
    }

    public double getTotal() {
        double total = 0;
        for (Conta conta : contas) {
            total += conta.getValor();
        }
        return total;
    }

    public double getPago() {
        double pago = 0;
        for (Conta conta : contas) {
            if (conta.isPaga()) {
                pago += conta.getValor();
            }
        }
        return pago;
    }

    public double getApagar() {
        return getTotal() - getPago();
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void setContas(LinkedList<Conta> contas) {
        this.contas = contas;
    }

}
