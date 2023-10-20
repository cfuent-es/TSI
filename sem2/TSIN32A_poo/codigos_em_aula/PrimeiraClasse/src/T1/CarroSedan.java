public class CarroSedan extends Veiculo{
    
    public CarroSedan(int quilometragem, TanqueCombustivel tanqueCombustivel, Freios freios) {
        super(quilometragem, tanqueCombustivel, freios);
    }

    public boolean andar(int distancia, int velocidade) {
        int consumo;

        if(velocidade < 100)
            consumo = distancia / 25;
        else
            consumo = distancia / 10;

        super.andar(distancia, velocidade, consumo);

        return true;
    }
    
}
