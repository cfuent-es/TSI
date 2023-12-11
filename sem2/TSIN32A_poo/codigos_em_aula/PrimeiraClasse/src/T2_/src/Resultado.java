import java.util.ArrayList;

public class Resultado {
    private String nomeAtleta;
    private int inscritos;
    private ArrayList<DesempenhoAtleta> desempenhos = new ArrayList<DesempenhoAtleta>();

    public Resultado(String nomeAtleta, int inscritos) {
        this.nomeAtleta = nomeAtleta;
        this.inscritos = inscritos;
    }

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public void addDesempenho(DesempenhoAtleta desempenho) {
        this.desempenhos.add(desempenho);
    }
}
