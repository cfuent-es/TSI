package tiposEspeciais.exemplos.aula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exemplo9 {

	public static void main(String[] args) {
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataTextual = "10/10/2000";
		
		LocalDate dataNascimento = LocalDate.parse(dataTextual, dateFormatter);
		System.out.println(dataNascimento);
	}
}


