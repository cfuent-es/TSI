import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public abstract class LeitorCSV {

    /**
     * Método para ler o arquivo CSV com os registros das contas
     * 
     * @param caminhoArq - caminho para o arquivo CSV de entrada
     * @return uma lista com objetos do tipo Conta
     */
    public static Map<String, TreeMap<String, Integer>> lerArquivo(String caminhoArq) {
        Map<String, TreeMap<String, Integer>> candidatos = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                candidatos.putIfAbsent(campos[0], new TreeMap<>());

                TreeMap<String, Integer> votosCidade = candidatos.get(campos[0]);
                votosCidade.put(campos[1], votosCidade.getOrDefault(campos[1], 0) + Integer.parseInt(campos[2]));
            }
        } 
        catch (IOException e) {
        }
        return candidatos;
    }
}