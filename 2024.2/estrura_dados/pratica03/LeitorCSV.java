import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class LeitorCSV {

    /**
     * Método para ler o arquivo CSV com os registros das contas
     * 
     * @param caminhoArq - caminho para o arquivo CSV de entrada
     * @return uma lista com objetos do tipo Conta
     */
    public static List<Filme> lerArquivo(String caminhoArq) {
        List<Filme> filmes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Filme filme = new Filme(
                    campos[0], 
                    campos[1], 
                    Integer.parseInt(campos[2]), 
                    campos[3], 
                    campos[4], 
                    Integer.parseInt(campos[5]), 
                    Double.parseDouble(campos[6]),
                    Double.parseDouble(campos[7]),
                    Double.parseDouble(campos[8])
                );
                filmes.add(filme);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return filmes;
    }
    
    public static void main(String[] args){
        List<Filme> filmes = lerArquivo("filmes.csv");
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }
}