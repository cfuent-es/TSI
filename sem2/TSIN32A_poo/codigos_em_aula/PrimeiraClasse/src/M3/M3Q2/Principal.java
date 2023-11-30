package M3.M3Q2;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcao = "s";
        String nome, dataNascimento;
        String[] nomes = new String[5];
        LocalDate[] datas = new LocalDate[5];

        int qtd = 0, totalIdades = 0;

        while (opcao.equals("s")) {
            System.out.println("informe o nome da pessoa (ainda podem ser cadastradas " + (5 - qtd) + " pessoas)");
            nome = entrada.next();
            nomes[qtd] = nome;

            System.out.println("informe a data de nascimento (dia/mes/ano)");
            dataNascimento = entrada.next();
            datas[qtd] = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            totalIdades = totalIdades + (2022 - Integer.parseInt(datas[qtd].format(DateTimeFormatter.ofPattern("yyyy"))));
            
            qtd++;
            
            if(qtd == 5){
                System.out.println("capacidade maxima de armazenamento atingida");
                break;
            }

            System.out.println("deseja cadastrar outra pessoa? (s ou n)");
            opcao = entrada.next();

            if(opcao.equals("n")) {
                break;
            }
        }

        System.out.println("pessoas cadastradas:");

        for(int i = 0; i < qtd; i++){
            System.out.println(
                "Pessoa [nome=" +
                nomes[i] + 
                ", dataNascimento=" + 
                datas[i].format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + 
                "]"
            );
        }

        double mediaIdades = (double) totalIdades / qtd;
        DecimalFormat df = new DecimalFormat("#.##");
        df.setMinimumFractionDigits(2);
        String mediaIdadesFormatada = df.format(mediaIdades);

        System.out.println("media de idade das pessoas: " + mediaIdadesFormatada);
    }
}
