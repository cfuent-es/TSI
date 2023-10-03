package M1;
import java.util.Scanner;

public class M1Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int total = 0, ent = 0;
		
		ent = entrada.nextInt();
		total += ent;
		
		ent = entrada.nextInt();
		total += ent;
		
		ent = entrada.nextInt();
		total += ent;
		
		System.out.println("Soma: " + total);
		
		entrada.close();

	}

}
