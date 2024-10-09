import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Trabalhador {
	private String nome;
	private int idade;
	private String profissao;
    private int tempoServico;
	
	public Trabalhador(String nome, String dataNascimento, String profissao, int tempoServico, String dataReferencia) {
        this.nome = nome;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(dataNascimento, formatter);
        LocalDate referencia = LocalDate.parse(dataReferencia, formatter);

        Period periodo = Period.between(nascimento, referencia);
        this.idade = periodo.getYears();

        this.profissao = profissao;
        this.tempoServico = tempoServico;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public int getTempoServico() {
        return this.tempoServico;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }
}
