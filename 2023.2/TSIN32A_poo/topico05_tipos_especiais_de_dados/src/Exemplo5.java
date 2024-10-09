package tiposEspeciais.exemplos.aula;

import java.time.LocalDate;
import java.time.Period;

public class Exemplo5 {

	public static void main(String[] args) {
		LocalDate dataNascimento = LocalDate.of(2000, 10, 10);
		LocalDate hoje = LocalDate.now();
		Period periodo = Period.between(dataNascimento, hoje);
		int anos = periodo.getYears();
		int meses = periodo.getMonths();
		int dias = periodo.getDays();
		String resposta = String.format("Esta pessoa ja viveu %s anos, %s meses e %s dias", anos, meses, dias);
		System.out.println(resposta);
	}
}


