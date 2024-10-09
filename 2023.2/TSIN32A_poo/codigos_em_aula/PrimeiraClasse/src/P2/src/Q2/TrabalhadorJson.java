
public class TrabalhadorJson {
	private String nome;
	private String dataNascimento;
	private String profissao;
	private int tempoServico;
	
	public TrabalhadorJson(String nome, String dataNascimento, String profissao, int tempoServico) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
        this.tempoServico = tempoServico;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public int getTempoServico() {
        return this.tempoServico;
    }
}
