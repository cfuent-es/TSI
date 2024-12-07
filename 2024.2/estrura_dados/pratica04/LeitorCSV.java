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
    public static List<Acao> lerArquivo(String caminhoArq) {
        List<Acao> acoes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Acao acao = new Acao(
                    campos[0], 
                    campos[1]
                );
                acoes.add(acao);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return acoes;
    }
    
    public static void main(String[] args){
        List<Acao> acoes = lerArquivo("editor.csv");
        for (Acao acao : acoes) {
            System.out.println(acao);
        }
    }
}