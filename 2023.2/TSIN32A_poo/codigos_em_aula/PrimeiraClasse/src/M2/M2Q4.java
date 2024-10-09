package M2;

import java.util.Scanner;

public class M2Q4 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        double renda, imposto = 0.115;
        String estado_civil, filhos;

        renda  = entrada.nextDouble();
        entrada.nextLine();

        estado_civil = entrada.nextLine();
        if(estado_civil.equals("solteiro"))
            imposto += 0.023;

        filhos = entrada.nextLine();
        if(filhos.equals("não"))
            imposto += 0.011;

        if(renda > 50000)
            imposto += 0.065;

        if(renda > 100000)
            imposto += 0.01;

        if(renda > 500000)
            imposto += 0.02;

        renda = renda * imposto;

        String impostoF = String.format("%.2f", imposto * 100);
        String rendaF = String.format("%.2f", renda);

        System.out.println("taxa de imposto aplicada: " + impostoF + "%");
        System.out.println("valor devido R$: " + rendaF);
        
        entrada.close();

    }
}
