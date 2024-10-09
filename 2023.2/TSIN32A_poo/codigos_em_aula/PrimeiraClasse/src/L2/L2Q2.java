package L2;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class L2Q2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        String text[] = new String[6];
        LocalDate localDates[] = new LocalDate[3];

        for(int i = 0; i < 6; i++){
            if(i % 2 == 0) {
                System.out.println("digite o nome da pessoa");
                text[i] = entrada.nextLine();
            }
            else{
                System.out.println("digite a data de nascimento da pessoa");
                text[i] = entrada.nextLine();
                localDates[i/2] = LocalDate.parse(text[i], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            }
            
        }

        System.out.println("pessoas cadastradas");

        for(int i = 0; i < 3; i++){
            System.out.println("Pessoa [nome=" + text[i*2] + ", dataNascimento=" + text[i*2 + 1] + "]");
        }

        entrada.close();

        // verifica se todas as datas são iguais ou diferentes
        if(localDates[0].compareTo(localDates[1]) == 0){
            if(localDates[1].compareTo(localDates[2]) == 0){
                System.out.println("Todas as pessoas nasceram no mesmo dia");
                System.exit(0); 
            }
            else {
                System.out.println("as datas de nascimento devem ser todas iguais ou todas diferentes");
                System.exit(0); 
            }
        }
        else{
            if(localDates[1].compareTo(localDates[2]) == 0){
                System.out.println("as datas de nascimento devem ser todas iguais ou todas diferentes");
                System.exit(0); 
            }
            else {
                if(localDates[0].compareTo(localDates[1]) < 0){
                    if(localDates[0].compareTo(localDates[2]) < 0){
                        System.out.println("pessoa mais velha: " + text[0]);
                        System.exit(0);
                    }
                    else {
                        System.out.println("pessoa mais velha: " + text[4]);
                        System.exit(0);
                    }
                }
                else {
                    if(localDates[1].compareTo(localDates[2]) < 0){
                        System.out.println("pessoa mais velha: " + text[2]);
                        System.exit(0);
                    }
                    else {
                        System.out.println("pessoa mais velha: " + text[4]);
                        System.exit(0);
                    }
                }
            }
        }

        

	}

}
