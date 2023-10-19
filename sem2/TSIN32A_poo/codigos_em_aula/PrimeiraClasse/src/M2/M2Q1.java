package M2;

import java.util.Scanner;

public class M2Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String resp1, resp2, resp3, resp4, resp5;
		int total = 0;
		
		System.out.println("Telefonou para a vítima? (sim|nao)");
		resp1 = entrada.nextLine();
		if(resp1.equals("sim"))
			total += 1;
		
		System.out.println("Esteve no local do crime? (sim|nao)");
		resp2 = entrada.nextLine();
		if(resp2.equals("sim"))
			total += 1;
		
		System.out.println("Mora perto da vítima? (sim|nao)");
		resp3 = entrada.nextLine();
		if(resp3.equals("sim"))
			total += 1;
		
		System.out.println("Devia dinheiro para a vítima? (sim|nao)");
		resp4 = entrada.nextLine();
		if(resp4.equals("sim"))
			total += 1;
		
		System.out.println("Já trabalhou com a vítima? (sim|nao)");
		resp5 = entrada.nextLine();
		if(resp5.equals("sim"))
			total += 1;
		
		switch (total) {
			case 0:
			case 1: {
				System.out.print("Inocente");
				break;
			}
			case 2: {
				System.out.print("Suspeita");
				break;
			}
			case 3:
			case 4: {
				System.out.print("Cúmplice");
				break;
			}
			case 5: {
				System.out.print("Assassino");
				break;
			}
				
		}
		
		entrada.close();
	}

}
