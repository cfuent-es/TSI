package T2Old;

import java.time.LocalDate;

public class AtletaGinasta extends Atleta{
    
    public AtletaGinasta(
        String nome,
        LocalDate dataNascimento,
        double peso,
        double flexibilidade,
        double resistencia,
        double folego,
        double forca, 
        int numeroLesoes
    ) {
        super(
            nome, 
            dataNascimento, 
            peso, 
            flexibilidade, 
            resistencia, 
            folego, 
            forca, 
            numeroLesoes
        );
    }

}
