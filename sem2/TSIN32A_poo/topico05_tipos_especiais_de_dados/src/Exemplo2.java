package tiposEspeciais.exemplos.aula;

import java.math.BigDecimal;

public class Exemplo2 {
	
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		
		System.out.println(bd1.add(bd2).setScale(2));
		System.out.println(bd1.subtract(bd2).setScale(3));
		System.out.println(bd1.multiply(bd2).setScale(4));
		System.out.println(bd1.divide(bd2).setScale(2));
		System.out.println(bd1.min(bd2).setScale(2));
		System.out.println(bd1.max(bd2).setScale(2));
	}
}


