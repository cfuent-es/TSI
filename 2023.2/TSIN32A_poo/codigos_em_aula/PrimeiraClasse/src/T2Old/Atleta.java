package T2Old;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Atleta {
    private String nome;
    private LocalDate dataNascimento;
    private double peso;
    private double flexibilidade;
    private double resistencia;
    private double folego;
    private double forca;
    private int numeroLesoes;

    public Atleta(String nome, LocalDate dataNascimento, double peso, double flexibilidade, double resistencia, double folego, double forca, int numeroLesoes) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.flexibilidade = flexibilidade;
        this.resistencia = resistencia;
        this.folego = folego;
        this.forca = forca;
        this.numeroLesoes = numeroLesoes;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public double getFlexibilidade() {
        return flexibilidade;
    }

    public double getResistencia() {
        return resistencia;
    }

    public double getFolego() {
        return folego;
    }

    public double getForca() {
        return forca;
    }

    public int getNumeroLesoes() {
        return numeroLesoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setFlexibilidade(double flexibilidade) {
        this.flexibilidade = flexibilidade;
    }

    public void setResistencia(double resistencia) {
        this.resistencia = resistencia;
    }

    public void setFolego(double folego) {
        this.folego = folego;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }

    public void setNumeroLesoes(int numeroLesoes) {
        this.numeroLesoes = numeroLesoes;
    }

    //public abstract BigDecimal competir();
}
