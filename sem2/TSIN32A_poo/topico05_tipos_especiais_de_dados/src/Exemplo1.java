package tiposEspeciais.exemplos.aula;

import java.math.BigDecimal;

public class Exemplo1 {
	
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println(bd3);
	}

}

