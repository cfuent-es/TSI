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
    public static List<Participante> lerArquivo(String caminhoArq, String evento) {
        List<Participante> participantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                if(campos[2].equals(evento)){
                    Participante participante = new Participante(
                        Integer.parseInt(campos[0]), 
                        campos[1]
                    );
                    participantes.add(participante);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return participantes;
    }
}