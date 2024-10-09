package M1;
import java.util.Scanner;

public class M1Q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numArray = new int[5];
		
		numArray[0] = entrada.nextInt();
		numArray[1] = entrada.nextInt();
		numArray[2] = entrada.nextInt();
		numArray[3] = entrada.nextInt();
		numArray[4] = entrada.nextInt();
		
		System.out.println(
			numArray[4] + ", " +
			numArray[3] + ", " +
			numArray[2] + ", " +
			numArray[1] + ", " +
			numArray[0]
		);

		entrada.close();
	}

}
