//package P1.Q3;

public class Estudante {
	private String nome;
	private Nivel nivel;
	private int idade;
	
	public Estudante(String nome, Nivel nivel, int idade) {
		this.nome = nome;
		this.nivel = nivel;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
