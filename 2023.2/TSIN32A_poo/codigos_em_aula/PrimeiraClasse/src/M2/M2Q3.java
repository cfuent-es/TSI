package M2;

import java.util.Scanner;
import java.util.ArrayList;

public class M2Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, pares = 0;
		ArrayList<Integer> numeros = new ArrayList<>();
		
		while(true) {
			numero = entrada.nextInt();
			
			if(numero == 0)
				break;
			
			if(numeros.size() == 10) {
				System.out.println("capacidade de armazenamento esgotada");
				break;
			}
			
			if(numero >= 1 && numero <= 100)
				numeros.add(numero);
			else 
				System.out.println("número inválido");
		}
		System.out.print("números armazenados: "); 
		for(int num : numeros) {
			System.out.print(num + "; ");
			if(num % 2 == 0)
				pares += num;
		}
		System.out.println();
		System.out.println("soma dos números pares: " + pares);
		entrada.close();
	}

}
