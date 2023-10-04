package tiposEspeciais.exemplos.aula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exemplo8 {

	public static void main(String[] args) {
		LocalDateTime dataNascimento = LocalDateTime.of(2023, 4, 6, 10, 30, 20,10);
		LocalDate hoje = LocalDate.now();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println(dataNascimento.format(dateTimeFormatter));
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(dateFormatter));
	}
}


