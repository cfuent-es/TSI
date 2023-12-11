package L2.L2Q4;

public class Programa {
	public static void main(String[] args) {
		Bangu bangu = new Bangu();
		bangu.setCapacidade(2);

		Papuda papuda = new Papuda();
		papuda.setCapacidade(2);

		Prisioneiro p1 = new Prisioneiro("pedro", Crime.ASSALTO);
		Prisioneiro p2 = new Prisioneiro("maria", Crime.CORRUPCAO);
		Prisioneiro p3 = new Prisioneiro("joao", Crime.ASSASSINATO);
		Prisioneiro p4 = new Prisioneiro("carlos", Crime.ASSASSINATO);
		Prisioneiro p5 = new Prisioneiro("alice", Crime.ROUBO);

		Prisioneiro[] prisioneiros = new Prisioneiro[5];
		prisioneiros[0] = p1;
		prisioneiros[1] = p2;
		prisioneiros[2] = p3;
		prisioneiros[3] = p4;
		prisioneiros[4] = p5;
		
		for (Prisioneiro prisioneiro : prisioneiros) {
			try {
				bangu.hospedar(prisioneiro);
			} catch (RuntimeException excecaoBangu) {
				System.out.println(excecaoBangu.getMessage());
				try {
					papuda.hospedar(prisioneiro);
				} catch (RuntimeException excecaoPapuda) {
					System.out.println(excecaoPapuda.getMessage());
				}
			}
		}
	}
}
