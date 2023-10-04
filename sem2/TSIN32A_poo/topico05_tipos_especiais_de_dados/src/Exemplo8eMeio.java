package tiposEspeciais.exemplos.aula;

import java.time.LocalDate;

public class Exemplo8eMeio {

	public static void main(String[] args) {
		
		String dataTextual1 = "2000-10-10";		
		LocalDate dataNascimento1 = LocalDate.parse(dataTextual1);
		System.out.println(dataNascimento1);
		
		String dataTextual2 = "10/10/2000";		
		LocalDate dataNascimento2 = LocalDate.parse(dataTextual2);
		System.out.println(dataNascimento2);
	}
}


