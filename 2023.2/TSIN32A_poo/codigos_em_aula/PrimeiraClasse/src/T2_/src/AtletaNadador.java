import java.math.BigDecimal;
import java.math.RoundingMode;

public class AtletaNadador extends Atleta{

    public AtletaNadador(
        String nome,
        String dataNascimento,
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

    public double desempenho() {
        double desempenho = 0;

        desempenho = 1 + 
            (this.getForca() * 0.5) + 
            (this.getResistencia() * 0.6) +
            (this.getFolego() * 1.0) + 
            (this.getFlexibilidade() * 0.3) -
            (this.getPeso() / 100) -
            (this.getNumeroLesoes().doubleValue() / 10);

        BigDecimal des_ = new BigDecimal(desempenho);
        des_ = des_.setScale(4, RoundingMode.HALF_UP);
        return des_.doubleValue();

    }
    
}
