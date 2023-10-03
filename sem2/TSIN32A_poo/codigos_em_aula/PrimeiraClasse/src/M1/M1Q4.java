package M1;
import java.util.Scanner;

public class M1Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		String nome;
		
		numero = entrada.nextInt();
		System.out.println("Numero: " + numero);
		entrada.nextLine();
		
		nome = entrada.nextLine();
		System.out.println("Texto: " + nome);
		
		entrada.close();

	}

}
