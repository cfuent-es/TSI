import java.util.ArrayList;

public class Competicao {
    ArrayList<Atleta> atletas = new ArrayList<Atleta>();

    public void registrar(Atleta atleta) {
        
        if(atleta.getIdade() < 18 || atleta.getIdade() > 45)
            throw new ExceptionIdade(atleta.getIdade());

        if(atleta.getNumeroLesoes().intValue() > 10)
            throw new ExceptionExcessoLesoes(atleta.getNome());
        
        this.atletas.add(atleta);

    }
}
