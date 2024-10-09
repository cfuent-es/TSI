package tiposEspeciais.exemplos.aula;

import java.time.LocalDate;
import java.time.Period;

public class Exemplo4 {
	
	public static void main(String[] args) {
		LocalDate dataNascimento = LocalDate.of(2000, 10, 10);
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(dataNascimento, hoje);
		System.out.println(periodo);		
	}
}




