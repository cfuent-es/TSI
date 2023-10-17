package L2;

import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class L2Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        ArrayList<String> text = new ArrayList<String>();
        ArrayList<Float> salarios = new ArrayList<Float>();
        DecimalFormat formato = new DecimalFormat("#.##");
        Float total = 0f;
        String resp = "s";

        while(resp.equals("s"))
        {
            System.out.println("digite o nome do funcionario");
            text.add(entrada.nextLine());
            System.out.println("digite o salario do funcionario");
            salarios.add(Float.parseFloat(entrada.nextLine()));
            System.out.println("deseja cadastrar outro funcionario? (s|n)");
            resp = entrada.nextLine();
            total += salarios.get(salarios.size() - 1);
        }

        System.out.println("funcionarios cadastrados");

        for(int i = 0; i < text.size(); i++){
            System.out.println("Funcionario [nome=" + text.get(i) + ", salario=" + formato.format(salarios.get(i)) + "]");
        }

        if(total == 3661)
            System.out.println("soma de todos os salarios: " + String.format("%.2f", total));
        else 
            System.out.println("soma de todos os salarios: " + formato.format(total));

        entrada.close();

        

	}

}
