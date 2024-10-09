public class AtletaJson {
    private String nome;
    private String dataNascimento;
    private double peso;
    private double flexibilidade;
    private double resistencia;
    private double folego;
    private double forca;
    private int numeroLesoes;

    public AtletaJson(String nome, String dataNascimento, double peso, double flexibilidade, double resistencia, double folego, double forca, int numeroLesoes) {
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

    public String getDataNascimento() {
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
}
