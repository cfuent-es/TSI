package P1.Q3;

public class ColegioOlavoBilac {
	private int capacidade;
	private int matriculados = 0;
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getMatriculados() {
		return matriculados;
	}
	public void setMatriculados(int matriculados) {
		this.matriculados = matriculados;
	}
	
	public boolean matricular(Estudante estudante)
	{
		boolean retorno = true;
		if(estudante.getNivel() == Nivel.INFANTIL) {
			System.out.println("colegio olavo bilac nao recebe alunos do ensino infantil");
			retorno = false;
		}
		
		else if(estudante.getIdade() < 9) {
			System.out.println("colegio olavo bilac nao recebe alunos menores de 9 anos de idade");
			retorno = false;
		}
		
		else if(this.matriculados < this.capacidade) {
			System.out.println("estudante " + estudante.getNome() + " - do nivel " + estudante.getNivel() + " - matriculado no colegio olavo bilac");
			matriculados++;
			retorno = true;
		}
		else {
			System.out.println("colegio olavio nao pode mais receber alunos");
			retorno = false;
		}
		
		return retorno;
	}
	
	
}
