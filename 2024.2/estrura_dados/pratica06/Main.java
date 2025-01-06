
import java.util.Map;
import java.util.TreeMap;


public class Main {
    public static void main(String[] args) {

        Map<String, TreeMap<String, Integer>> candidatos = LeitorCSV.lerArquivo("votacao.csv");

        System.out.println("Relatório da votação:");

        for(String candidato : candidatos.keySet()) {
            System.out.println("* " + candidato + ":");
            int totalVotos = 0;

            TreeMap<String, Integer> votosCidade = candidatos.get(candidato);

            for(Map.Entry<String, Integer> cidade : votosCidade.entrySet()) {
                System.out.println("  " + cidade.getKey() + ": recebeu " + cidade.getValue() + " votos");
                totalVotos += cidade.getValue();
            }
            System.out.println("  Total de votos: " + totalVotos);
        }
        
    }
}
