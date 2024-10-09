package T1;

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
            this.quilometragem += quilometragem;
        }
    }

    public TanqueCombustivel getTanqueCombustivel() {
        return tanqueCombustivel;
    }

    public void setTanqueCombustivel(TanqueCombustivel tanqueCombustivel) {
        this.tanqueCombustivel = tanqueCombustivel;
    }

    public Freios getFreios() {
        return freios;
    }

    public void setFreios(Freios freios) {
        this.freios = freios;
    }

    public boolean andar(int distancia, int velocidade, int consumo)
    {
        if(freios.getVidaUtilRestante() < 0){
            JOptionPane.showMessageDialog(null, "Erro: os freios estão desgastados!", "Alerta de erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(this.getTanqueCombustivel().getVolumeAtual() < consumo){
            JOptionPane.showMessageDialog(
                null, 
                "Não há combustível suficiente para a distância solicitada e velocidade!", 
                "Combustível Insuficiente", 
                JOptionPane.ERROR_MESSAGE
            );
            return false;
        }

        this.setQuilometragem(distancia);
        this.getTanqueCombustivel().setVolumeAtual(consumo);
        this.getFreios().usarFreios(distancia, velocidade);

        return true;
    };

    public void arrumarFreios(Freios freios)
    {
        this.setFreios(freios);
        JOptionPane.showMessageDialog(
            null, 
            "Os freios foram arrumados com sucesso!", 
            "Freios Arrumados", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void showInformations(String carro)
    {
        JOptionPane.showMessageDialog(
            null, 
            "Informações do " + carro + ": \n\n" +
            "Quilometragem: " + this.getQuilometragem() + " km \n" +
            "Combustível: " + this.getTanqueCombustivel().getCombustivel() + " \n" +
            "Volume Atual: " + this.getTanqueCombustivel().getVolumeAtual() + " litros \n" +
            "Capacidade Máxima: " + this.getTanqueCombustivel().getCapacidadeMaxima() + " litros \n" +
            "Tipo de Freios: " + this.freios.getTipo() + " \n" +
            "Vida Útil Restante: " + this.getFreios().getVidaUtilRestante() + " km \n",
            "Informações do " + carro,
            JOptionPane.INFORMATION_MESSAGE
        );
    }

}
