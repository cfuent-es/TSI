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
    public static List<Conta> lerArquivo(String caminhoArq) {
        List<Conta> contas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Conta conta = new Conta(campos[0], campos[1], campos[2], Double.parseDouble(campos[3]));
                contas.add(conta);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return contas;
    }
    
    public static void main(String[] args){
        List<Conta> contas = lerArquivo("contas.csv");
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }
}