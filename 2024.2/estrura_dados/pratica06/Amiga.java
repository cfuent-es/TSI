import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Amiga {
    public static void main(String[] args) {
        // Mapa principal: Candidato -> (Cidade -> Votos)
        Map<String, TreeMap<String, Integer>> resultados = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("votacao.csv"))) {
            String linha;
            br.readLine(); // Ignorar o cabeçalho

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                String candidato = partes[0].trim();
                String cidade = partes[1].trim();
                int votos = Integer.parseInt(partes[2].trim());

                // Adicionar ao mapa
                resultados.putIfAbsent(candidato, new TreeMap<>());
                TreeMap<String, Integer> votosPorCidade = resultados.get(candidato);
                votosPorCidade.put(cidade, votosPorCidade.getOrDefault(cidade, 0) + votos);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

        // Gerar relatório
        System.out.println("Relatório da votação:");
        for (String candidato : resultados.keySet()) {
            System.out.println("* " + candidato + ":");
            int totalVotos = 0;
            TreeMap<String, Integer> votosPorCidade = resultados.get(candidato);

            for (Map.Entry<String, Integer> entrada : votosPorCidade.entrySet()) {
                String cidade = entrada.getKey();
                int votos = entrada.getValue();
                totalVotos += votos;
                System.out.println("  " + cidade + ": recebeu " + votos + " votos");
            }
            System.out.println("  Total de votos: " + totalVotos);
        }
    }
}