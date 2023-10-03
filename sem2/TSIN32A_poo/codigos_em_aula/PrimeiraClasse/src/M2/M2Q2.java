package M2;

import java.util.Scanner;

public class M2Q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade, peso, qtd;
		String sexo;
		
		idade 	= entrada.nextInt();
		peso 	= entrada.nextInt();
		entrada.nextLine();
		sexo 	= entrada.nextLine();
		qtd 	= entrada.nextInt();
				
		if(idade < 18 || idade > 67) {
			System.out.print("Não pode doar sangue");
			System.exit(0);
		}
		
		if(peso < 46) {
			System.out.print("Não pode doar sangue");
			System.exit(0);
		}
		
		if(sexo.equals("f") && qtd >= 3){
			System.out.print("Não pode doar sangue");
			System.exit(0);
		}
		
		if(sexo.equals("m") && qtd >= 4){
			System.out.print("Não pode doar sangue");
			System.exit(0);
		}
		
		System.out.print("Pode doar sangue");

	}

}
