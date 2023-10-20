public class TanqueCombustivel {
    private Combustivel combustivel;
    private int capacidadeMaxima;
    private int volumeAtual;
    private int combustivelUtilizado;

    public TanqueCombustivel(Combustivel combustivel, int capacidadeMaxima) {
        this.combustivel = combustivel;
        this.capacidadeMaxima = capacidadeMaxima;
        this.volumeAtual = 1;
        this.combustivelUtilizado = 0;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getVolumeAtual() {
        return volumeAtual;
    }

    public void setVolumeAtual(int volumeAtual) {
        this.volumeAtual -= volumeAtual;
    }

    public int getCombustivelUtilizado() {
        return combustivelUtilizado;
    }

    public void setCombustivelUtilizado(int combustivelUtilizado) {
        this.combustivelUtilizado = combustivelUtilizado;
    }

    public boolean consumir(int quantidade){
        return true;
    }

    public void receber(int quantidade, Combustivel combustivel){

    }   


}
