import java.util.ArrayList;

public class InscricaoNegadaTotal {
    private int numeroInscricoesNegadas;
    ArrayList<InscricaoNegada> inscricoesNegadas = new ArrayList<InscricaoNegada>();

    public InscricaoNegadaTotal(int numeroInscricoesNegadas) {
        this.numeroInscricoesNegadas = numeroInscricoesNegadas;
    }

    public int getNumeroInscricoesNegadas() {
        return numeroInscricoesNegadas;
    }

    public void setNumeroInscricoesNegadas(int numeroInscricoesNegadas) {
        this.numeroInscricoesNegadas = numeroInscricoesNegadas;
    }

    public void addInscricaoNegada(InscricaoNegada inscricaoNegada) {
        this.inscricoesNegadas.add(inscricaoNegada);
    }
}
