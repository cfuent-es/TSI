package L2;

import java.util.Scanner;

public class L2Q1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        String text[] = new String[6];

        for(int i = 0; i < 6; i++){
            if(i % 2 == 0)
                System.out.println("digite o nome da pessoa");
            else

                System.out.println("digite a data de nascimento da pessoa");
            text[i] = entrada.nextLine();
        }

        System.out.println("pessoas cadastradas");

        for(int i = 0; i < 3; i++){
            System.out.println("Pessoa [nome=" + text[i*2] + ", dataNascimento=" + text[i*2 + 1] + "]");
        }

        entrada.close();
        

	}

}
