package P1;

import java.util.Scanner;

public class P1Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        String text[] = new String[9];
        Float total = 0f;

        System.out.println("digite o nome do funcionario");
        text[0] = entrada.nextLine();
        System.out.println("digite a data de contratacao do funcionario");
        text[1] = entrada.nextLine();   
        System.out.println("digite o salario do funcionario");
        text[2] = entrada.nextLine();
        total = total + total.parseFloat(text[2]);
        
        System.out.println("digite o nome do funcionario");
        text[3] = entrada.nextLine();
        System.out.println("digite a data de contratacao do funcionario");
        text[4] = entrada.nextLine();   
        System.out.println("digite o salario do funcionario");
        text[5] = entrada.nextLine();
        total = total + total.parseFloat(text[5]);
        
        System.out.println("digite o nome do funcionario");
        text[6] = entrada.nextLine();
        System.out.println("digite a data de contratacao do funcionario");
        text[7] = entrada.nextLine();   
        System.out.println("digite o salario do funcionario");
        text[8] = entrada.nextLine();
        total = total + total.parseFloat(text[8]);

        System.out.println("funcionarios cadastrados");


		System.out.println("Funcionario [nome=" + text[0] + ", dataContratacao=" + text[1] + ", salario=" + text[2] + "]");
		System.out.println("Funcionario [nome=" + text[3] + ", dataContratacao=" + text[4] + ", salario=" + text[5] + "]");
		System.out.println("Funcionario [nome=" + text[6] + ", dataContratacao=" + text[7] + ", salario=" + text[8] + "]");
		
		System.out.println("soma dos salarios: " + total);


        entrada.close();

	}

}