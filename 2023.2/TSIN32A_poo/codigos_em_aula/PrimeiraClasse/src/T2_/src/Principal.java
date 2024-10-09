import java.util.List;

public class Principal {

	public static void main(String[] args) {
		JsonSerializer serializer = new JsonSerializer();

		System.out.println("Iniciando processamento da modalidade ginastica");
        processarCompeticao(serializer, serializer.deserializeGinastasJson(), "ginastica");
        System.out.println("Termino do processamento da modalidade ginastica");
        
        System.out.println("Iniciando processamento da modalidade natacao");
        processarCompeticao(serializer, serializer.deserializeNadadoresJson(), "natacao");
        System.out.println("Termino do processamento da modalidade natacao");
        
        System.out.println("Iniciando processamento da modalidade halterofilismo");
        processarCompeticao(serializer, serializer.deserializeHalterofilistasJson(), "halterofilismo");
        System.out.println("Termino do processamento da modalidade halterofilismo");    
        
        System.out.println("\n\nArquivos processados com sucesso.");
    }

    private static <T extends Atleta> void processarCompeticao(JsonSerializer serializer, List<T> atletas, String nomeCompeticao) {
        InscricaoNegadaTotal inscricoesNegadas = new InscricaoNegadaTotal(0);
        int numeroParticipantes = 0, inscricoesNegadasQtd = 0;
        double maiorDesempenho = 0;
        String nomeAtletaMaiorDesempenho = "";
        Resultado resultado = new Resultado(nomeAtletaMaiorDesempenho, numeroParticipantes);
        Competicao competicao = new Competicao();
        for(T atleta : atletas) {
            try{
                competicao.registrar(atleta);
                resultado.addDesempenho(new DesempenhoAtleta(atleta.getNome(), atleta.desempenho()));
                numeroParticipantes++;
                resultado.setInscritos(numeroParticipantes);
                if(atleta.desempenho() > maiorDesempenho) {
                    maiorDesempenho = atleta.desempenho();
                    nomeAtletaMaiorDesempenho = atleta.getNome();
                    resultado.setNomeAtleta(nomeAtletaMaiorDesempenho);
                }
            } catch (ExceptionIdade | ExceptionExcessoLesoes e) {
                inscricoesNegadasQtd++;
                inscricoesNegadas.setNumeroInscricoesNegadas(inscricoesNegadasQtd);
                inscricoesNegadas.addInscricaoNegada(new InscricaoNegada(atleta.getNome(), e.getMessage()));
            }
        }
        serializer.serializeResultadoJson(resultado, "resultado-" + nomeCompeticao + ".json");
        serializer.serializeInscricoesNegadasJson(inscricoesNegadas, "inscricoes-negadas-" + nomeCompeticao + ".json");
    }

}
