import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Atleta {
    private String nome;
    private int idade;
    private double peso;
    private double flexibilidade;
    private double resistencia;
    private double folego;
    private double forca;
    private BigDecimal numeroLesoes;

    public Atleta(String nome, String dataNascimento, double peso, double flexibilidade, double resistencia, double folego, double forca, int numeroLesoes) {
        this.nome = nome;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(dataNascimento, formatter);
        this.idade = LocalDate.now().getYear() - nascimento.getYear();
        this.peso = peso;
        this.flexibilidade = flexibilidade;
        this.resistencia = resistencia;
        this.folego = folego;
        this.forca = forca;
        this.numeroLesoes = new BigDecimal(numeroLesoes);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
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

    public BigDecimal getNumeroLesoes() {
        return numeroLesoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(dataNascimento, formatter);
        this.idade = LocalDate.now().getYear() - nascimento.getYear();
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
        this.numeroLesoes = new BigDecimal(numeroLesoes);
    }

    public abstract double desempenho();
}
