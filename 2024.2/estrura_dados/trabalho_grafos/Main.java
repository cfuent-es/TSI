import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Grafo grafo = new Grafo();
        
        // lendo arquivo vertices.csv
        try (BufferedReader br = new BufferedReader(new FileReader("vertices.csv"))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                grafo.addVertice(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // lendo arquivo arestas.csv
        try (BufferedReader br = new BufferedReader(new FileReader("arestas.csv"))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] valores = linha.split(",");

                String origem = valores[0];

                String destino = valores[1];

                Integer perigo = Integer.parseInt(valores[2]);
                Integer distancia = Integer.parseInt(valores[3]);

                grafo.addAresta(origem, destino, perigo, distancia);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(grafo);
    }
} 