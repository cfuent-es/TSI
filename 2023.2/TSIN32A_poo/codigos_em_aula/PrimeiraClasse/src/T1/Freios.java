package T1;

public abstract class Freios {
    private int vidaUtilTotal;
    private int vidaUtilRestante;

    public Freios(int vidaUtilTotal) {
        this.vidaUtilTotal = vidaUtilTotal;
        this.vidaUtilRestante = vidaUtilTotal;
    }

    public int getVidaUtilTotal() {
        return vidaUtilTotal;
    }

    public void setVidaUtilTotal(int vidaUtilTotal) {
        this.vidaUtilTotal = vidaUtilTotal;
    }

    public int getVidaUtilRestante() {
        return vidaUtilRestante;
    }

    public void setVidaUtilRestante(int vidaUtilRestante) {
        this.vidaUtilRestante = vidaUtilRestante;
    }

    public void usarFreios(int distancia, int velocidade) {
        int vidaUtilGasta = distancia * velocidade;
        if (vidaUtilGasta > vidaUtilRestante) {
            vidaUtilRestante = 0;
        } else {
            vidaUtilRestante -= vidaUtilGasta;
        }
    }

    public void arrumar()
    {
        vidaUtilRestante = vidaUtilTotal;
    };

    public abstract String getTipo();

}
