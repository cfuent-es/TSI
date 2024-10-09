public class DesempenhoAtleta {
    private String nomeAtleta;
    private double desempenho;

    public DesempenhoAtleta(String nomeAtleta, double desempenho) {
        this.nomeAtleta = nomeAtleta;
        this.desempenho = desempenho;
    }

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public double getDesempenho() {
        return desempenho;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public void setDesempenho(double desempenho) {
        this.desempenho = desempenho;
    }
}
