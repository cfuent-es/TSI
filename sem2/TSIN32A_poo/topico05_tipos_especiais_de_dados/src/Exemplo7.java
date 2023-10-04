package tiposEspeciais.exemplos.aula;

import java.time.Duration;
import java.time.LocalDateTime;

public class Exemplo7 {

	public static void main(String[] args) {
		LocalDateTime dataNascimento = LocalDateTime.of(2023, 4, 6, 10, 30, 20,10);
		LocalDateTime agora = LocalDateTime.now();
		Duration duracao = Duration.between(dataNascimento, agora);
		System.out.println(duracao);		
	}
}


