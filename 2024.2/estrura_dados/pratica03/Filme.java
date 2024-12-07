public class Filme implements Comparable<Filme>{
    private String nome;
    private String diretor;
    private Integer ano;
    private String genero;
    private String classificacao;
    private Integer duracao;
    private Double avaliacao;
    private Double orcamento;
    private Double receita;

    public Filme(String nome, String diretor, Integer ano, String genero, String classificacao, Integer duracao, Double avaliacao, Double orcamento, Double receita) {
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.genero = genero;
        this.classificacao = classificacao;
        this.duracao = duracao;
        this.avaliacao = avaliacao;
        this.orcamento = orcamento;
        this.receita = receita;
    }

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public Integer getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public Double getReceita() {
        return receita;
    }

    @Override
    public int compareTo(Filme o) {
        return this.getNome().compareTo(o.getNome());
    }

    @Override
    public String toString() {
        return "Filme: " +
                nome + ", " +
                diretor + ", " +
                ano + ", " +
                genero + ", " +
                classificacao + ", " +
                duracao + ", " +
                avaliacao + ", " +
                orcamento + ", " +
                receita;
    }
}