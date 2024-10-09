package P1.Q2;

public class AnalisadorDepoimento {


	public String analisar(Depoimento depoimento) {
		int total = 0;
		
		if(depoimento.isMoraPerto())
			total++;
		
		if(depoimento.isDeviaDinheiro())
			total++;
		
		if(depoimento.isEsteveNoLocal())
			total++;
		
		if(depoimento.isTelefonou())
			total++;
	
		if(depoimento.isTrabalhou())
			total++;
		
		String retorno = "Inocente";
		
		switch (total) {
			case 0:
			case 1: {
				retorno = "Inocente";
				break;
			}
			case 2: {
				retorno = "Suspeita";
				break;
			}
			case 3:
			case 4: {
				retorno = "Cúmplice";
				break;
			}
			case 5: {
				retorno = "Assassino";
				break;
			}
				
		}
		
		return retorno;
	}

}
