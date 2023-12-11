package M3.M3Q1;

import java.util.Scanner;
import java.math.BigDecimal;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        BigDecimal media = new BigDecimal(0);
        Trabalhador[] trabalhadores = new Trabalhador[3];
        int qtd = 3;

        for (int i = 0; i < qtd; i++) {
            Trabalhador t = new Trabalhador();
            
            System.out.print("informe o nome do trabalhador");
            t.setNome(entrada.next());
            
            System.out.print("informe o salario do trabalhador");
            t.setSalario(new BigDecimal(entrada.next()));
            
            System.out.print("informe o cargo do trabalhador (MED, TRAD, PA, DEV)");
            String cargo = entrada.next();
            switch (cargo) {
                case "MED": {
                    t.setCargo(Cargo.MED);
                    break;
                }
                case "TRAD": {
                    t.setCargo(Cargo.TRAD);
                    break;
                }
                case "PA": {
                    t.setCargo(Cargo.PA);
                    break;
                }
                case "DEV": {
                    t.setCargo(Cargo.DEV);
                    break;
                }
                default:
                    throw new IllegalArgumentException("Unexpected value: " + cargo);
            }

            trabalhadores[i] = t;
        }

        System.out.println("trabalhadores cadastrados");

        for (int i = 0; i < qtd; i++){
            media = media.add(trabalhadores[i].getSalario());
            System.out.println(trabalhadores[i].toString());
        }

        System.out.println("media salarial dos trabalhadores R$" + media.divide(new BigDecimal(qtd)).setScale(2));

        entrada.close();

	}

}
