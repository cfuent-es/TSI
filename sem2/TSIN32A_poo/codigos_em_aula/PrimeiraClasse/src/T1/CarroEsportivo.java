package T1;

import javax.swing.JOptionPane;

public class CarroEsportivo extends Veiculo{
    
    public CarroEsportivo(int quilometragem, TanqueCombustivel tanqueCombustivel, Freios freios) {
        super(quilometragem, tanqueCombustivel, freios);
    }

    public boolean andar(int distancia, int velocidade) {
        int consumo;

        if(velocidade < 120)
            consumo = distancia / 10;
        else
            consumo = distancia / 5;

        super.andar(distancia, velocidade, consumo);

        return true;
    }

}
