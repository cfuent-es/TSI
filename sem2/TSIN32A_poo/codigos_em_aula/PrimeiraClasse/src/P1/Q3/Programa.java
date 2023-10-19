//package P1.Q3;

public class Programa {
	public static void main(String[] args) {
		ColegioOlavoBilac colegioOlavoBilac = new ColegioOlavoBilac();
		colegioOlavoBilac.setCapacidade(3);

		EscolaArcoIris escolaArcoIris = new EscolaArcoIris();
		escolaArcoIris.setCapacidade(3);

		Estudante p1 = new Estudante("pedro", Nivel.INFANTIL, 10);
		Estudante p2 = new Estudante("maria", Nivel.INFANTIL, 11);
		Estudante p3 = new Estudante("joao", Nivel.MEDIO, 14);
		Estudante p4 = new Estudante("carlos", Nivel.MEDIO, 13);
		Estudante p5 = new Estudante("alice", Nivel.FUNDAMENTAL, 8);
		Estudante p6 = new Estudante("nikolas", Nivel.MEDIO, 8);
		Estudante p7 = new Estudante("alberto", Nivel.MEDIO, 16);

		Estudante[] estudantes = new Estudante[7];
		estudantes[0] = p1;
		estudantes[1] = p2;
		estudantes[2] = p3;
		estudantes[3] = p4;
		estudantes[4] = p5;
		estudantes[5] = p6;
		estudantes[6] = p7;

		for (Estudante estudante : estudantes) {
			boolean matriculouOlavo = colegioOlavoBilac.matricular(estudante);
			if(!matriculouOlavo) {
				escolaArcoIris.matricular(estudante);				
			}
		}
	}
}
