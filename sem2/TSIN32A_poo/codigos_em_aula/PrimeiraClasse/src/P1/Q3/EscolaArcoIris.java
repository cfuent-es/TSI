//package P1.Q3;

public class EscolaArcoIris {
	private int capacidade;
	private int matriculados;
	
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
		
		if(this.matriculados == this.capacidade) {
			System.out.println("escola arcoiris nao pode mais receber alunos");
			return false;
		}
		
		if(estudante.getNivel() == Nivel.MEDIO) {
			System.out.println("escola arcoiris nao recebe alunos do ensino medio");
			retorno = false;
		}
		
		else if(this.matriculados < this.capacidade) {
			System.out.println("estudante " + estudante.getNome() + " - do nivel " + estudante.getNivel() + " - matriculado na escola arcoiris");
			matriculados++;
			retorno = true;
		}
		else {
			System.out.println("escola arcoiris nao pode mais receber alunos");
			retorno = false;
		}
		
		return retorno;
	}
	
	
}
