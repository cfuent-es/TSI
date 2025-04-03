package com.example.tarefa;

import java.io.Serializable;

public class Tarefa implements Serializable{

    private String descricao;
    private int horas;
    private char prioridade = 'M';
    private boolean feita = false;

    public Tarefa(String descricao, int horas, char prioridade) {
        this.descricao = descricao;
        this.horas = horas;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public char getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(char prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }

    @Override
    public String toString() {
        return descricao + " - " + horas + "hs - " + prioridade;
    }
}
