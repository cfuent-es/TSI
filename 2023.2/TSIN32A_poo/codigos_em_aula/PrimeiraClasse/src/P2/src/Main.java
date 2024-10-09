import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		ManipuladorArquivoJson manipuladorArquivoJson = new ManipuladorArquivoJson();
		List<Veiculo> veiculos = manipuladorArquivoJson.lerArquivoColecao();

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite a data de referencia (dd/mm/aaaa): ");
		String dataReferenciaTextual = entrada.nextLine();
		entrada.close();

		LocalDate dataReferencia = LocalDate.parse(dataReferenciaTextual, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        new AnalisadorDados().analisar(veiculos, dataReferencia); 

		Relatorio relatorio = new AnalisadorDados().analisar(veiculos, dataReferencia);		
		Gson gson = new GsonBuilder().setPrettyPrinting().registerTypeAdapter(LocalDate.class, new LocalDateTypeAdapter()).create();
        System.out.println(gson.toJson(relatorio));

	}
}