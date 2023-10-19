package P1.Q2;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Depoimento depoimento = new Depoimento();

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Telefonou para a vítima? (sim|nao) ");
		String telefonou = entrada.nextLine();
		if(telefonou.equalsIgnoreCase("sim")) {
			depoimento.setTelefonou(true);
		}
				
		System.out.println("Esteve no local do crime? (sim|nao) ");
		String esteveNoLocal = entrada.nextLine();
		if(esteveNoLocal.equalsIgnoreCase("sim")) {
			depoimento.setEsteveNoLocal(true);
		}
		
		System.out.println("Mora perto da vítima? (sim|nao) ");
		String moraPerto = entrada.nextLine();
		if(moraPerto.equalsIgnoreCase("sim")) {
			depoimento.setMoraPerto(true);
		}
		
		System.out.println("Devia dinheiro para a vítima? (sim|nao) ");
		String deviaDinheiro = entrada.nextLine();
		if(deviaDinheiro.equalsIgnoreCase("sim")) {
			depoimento.setDeviaDinheiro(true);
		}

		System.out.println("Já trabalhou com a vítima? (sim|nao) ");
		String trabalhou = entrada.nextLine();
		if(trabalhou.equalsIgnoreCase("sim")) {
			depoimento.setTrabalhou(true);
		}
		
		entrada.close();
			
		AnalisadorDepoimento analisadorDepoimento = new AnalisadorDepoimento();
		String resultado = analisadorDepoimento.analisar(depoimento);
		System.out.println(resultado);
	}

}
