package M2;

import java.util.Scanner;

public class M2Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int total = 0;
		
		//System.out.println("Telefonou para a vítima?");
		total += entrada.nextInt();
		
		//System.out.println("Esteve no local do crime?");
		total += entrada.nextInt();
		
		//System.out.println("Mora perto da vítima?");
		total += entrada.nextInt();
		
		//System.out.println("Devia dinheiro para a vítima?");
		total += entrada.nextInt();
		
		//System.out.println("Telefonou para a vítima?");
		total += entrada.nextInt();
		
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
