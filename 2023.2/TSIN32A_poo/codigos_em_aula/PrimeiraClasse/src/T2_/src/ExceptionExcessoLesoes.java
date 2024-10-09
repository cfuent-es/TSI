

public class ExceptionExcessoLesoes extends RuntimeException {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionExcessoLesoes(String nomeAtleta) {
        super("O atleta " + nomeAtleta + " nao pode competir por ter excesso de lesoes.");
    }

}