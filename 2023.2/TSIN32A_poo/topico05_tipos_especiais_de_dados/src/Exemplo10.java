package tiposEspeciais.exemplos.aula;

import java.math.BigDecimal;

public class Exemplo10 {
	public static void main(String[] args) {
		Trabalhador t = new Trabalhador();
		t.setNome("Alvaro");
		t.setSalario(new BigDecimal("5000"));
		t.setCargo(Cargo.MEDICO);
	}
}

