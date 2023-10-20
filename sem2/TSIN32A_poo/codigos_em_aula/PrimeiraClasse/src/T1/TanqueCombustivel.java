import javax.swing.JOptionPane;

public class TanqueCombustivel {
    private Combustivel combustivel;
    private int capacidadeMaxima;
    private int volumeAtual;

    public TanqueCombustivel(Combustivel combustivel, int capacidadeMaxima) {
        this.combustivel = combustivel;
        this.capacidadeMaxima = capacidadeMaxima;
        this.volumeAtual = 1;
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

    public void abastecer(int quantidade, Combustivel combustivel)
    {
        
        if(this.combustivel != combustivel){
            this.volumeAtual = 0;
        }

        this.combustivel = combustivel;
        this.volumeAtual += quantidade;

        if(this.volumeAtual > this.capacidadeMaxima){
            this.volumeAtual = this.capacidadeMaxima;
            JOptionPane.showMessageDialog(
                null, 
                "Atenção: a quantidade de combustível excedeu a capacidade máxima do tanque! Foi abastecido apenas o volume máximo do tanque.", 
                "Capacidade Máxima Atingida", 
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }


}
