import javax.swing.JOptionPane;

public abstract class Veiculo {
    private int quilometragem;
    private TanqueCombustivel tanqueCombustivel;
    private Freios freios;

    public Veiculo(int quilometragem, TanqueCombustivel tanqueCombustivel, Freios freios) {
        this.quilometragem = quilometragem;
        this.tanqueCombustivel = tanqueCombustivel;
        this.freios = freios;
    }


    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        if (quilometragem >= 0) {
            this.quilometragem = quilometragem;
        }
    }

    public boolean andar(int distancia, int velocidade)
    {
        if(freios.getVidaUtilRestante() < 0){
            JOptionPane.showMessageDialog(null, "Erro: os freios estão desgastados!", "Alerta de erro", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    };

    public void abastecer(int quantidade, Combustivel combustivel)
    {

    }

    public void arrumarFreios(Freios freios)
    {

    }

}
