

public class ExceptionIdade extends RuntimeException {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionIdade(int idade) {
        super(getMessage(idade));
    }

    private static String getMessage(int idade) {
        if(idade < 18)
            return "O atleta tem idade inferior a 18 anos.";
        else
            return "O atleta tem idade superior a 45 anos.";
    }
}
