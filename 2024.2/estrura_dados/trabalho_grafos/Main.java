import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static void listarVertices(Map<Integer, String> verticeMap) {
        System.out.println("Reinos:\n");
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<Integer, String> entry : verticeMap.entrySet()) {
            String vertice = entry.getKey() + " - " + entry.getValue();
            sb.append(vertice);
            if(entry.getKey() % 5 == 0) {
                sb.append("\n");
            } else {
                if (vertice.length() < 8) {
                    sb.append("\t\t\t");
                } else if (vertice.length() < 16) {
                    sb.append("\t\t");
                } else {
                    sb.append("\t");
                }
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        Grafo grafo = new Grafo();
        
        System.out.println("Iniciando importação dos reinos da Terra-Média...\n");
        LoadingAnimation.showLoadingAnimation(3);

        // lendo arquivo vertices.csv
        try (BufferedReader br = new BufferedReader(new FileReader("vertices.csv"))) {
            String linha;
            br.readLine();
            while ((linha = br.readLine()) != null) {
                grafo.addVertice(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Lista de reinos importados com sucesso!\n");
        LoadingAnimation.waitForSeconds(3);
        System.out.println("Iniciando importação dos caminhos possíveis...\n");
        LoadingAnimation.showLoadingAnimation(3);

        // lendo arquivo arestas.csv
        try (BufferedReader br = new BufferedReader(new FileReader("arestas.csv"))) {
            String linha;
            br.readLine();
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

        System.out.println("Lista de caminhos importados com sucesso!\n");
        LoadingAnimation.waitForSeconds(3);

        System.out.println("Exibindo a lista reinos e seus destinos...");
        LoadingAnimation.showLoadingAnimation(3);

        System.out.println(grafo);

        // Listar vértices com números
        List<String> vertices = grafo.getVertices();
        Map<Integer, String> verticeMap = new HashMap<>();
        for (int i = 0; i < vertices.size(); i++) {
            verticeMap.put(i + 1, vertices.get(i));
        }

        int opcao = 0;
        while (opcao != 3) {
            System.out.println("\n1 - Exibir lista reinos");
            System.out.println("2 - Definir origem e destino");
            System.out.println("3 - Sair\n");
            System.out.print("Escolha uma opção: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    listarVertices(verticeMap);
                    break;
                case 2:
                    System.out.println("Pesquisa de caminhos entre reinos.\n");
                    LoadingAnimation.waitForSeconds(2);
                    System.out.print("Digite o número do reino de origem: ");
                    int origem = scanner.nextInt();
                    System.out.print("Digite o número do reino de destino: ");
                    int destino = scanner.nextInt();
                    LoadingAnimation.showLoadingAnimation(3);
                    grafo.getRoutes(verticeMap.get(origem), verticeMap.get(destino));
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
        }

        
    }
} 