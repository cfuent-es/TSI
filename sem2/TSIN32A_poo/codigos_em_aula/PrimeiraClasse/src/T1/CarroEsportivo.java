public class CarroEsportivo extends Veiculo{
    
    public CarroEsportivo(int quilometragem, TanqueCombustivel tanqueCombustivel, Freios freios) {
        super(quilometragem, tanqueCombustivel, freios);
    }

    /*
    @Override
    public void andar(int distancia, int velocidade) {
        if (distancia > 0 && velocidade > 0) {
            int consumo = distancia / 10;
            if (consumo > getTanqueCombustivel().getQuantidadeCombustivel()) {
                System.out.println("Não há combustível suficiente para andar essa distância!");
            } else {
                setQuilometragem(getQuilometragem() + distancia);
                getTanqueCombustivel().setQuantidadeCombustivel(getTanqueCombustivel().getQuantidadeCombustivel() - consumo);
                System.out.println("O carro andou " + distancia + "km a " + velocidade + "km/h");
            }
        } else {
            System.out.println("A distância e a velocidade devem ser maiores que zero!");
        }
    }

    @Override
    public void abastecer(int quantidade, Combustivel combustivel) {
        if (quantidade > 0) {
            if (combustivel == Combustivel.ALCOOL) {
                System.out.println("Não é possível abastecer com álcool!");
            } else {
                if (getTanqueCombustivel().getQuantidadeCombustivel() + quantidade > getTanqueCombustivel().getCapacidade()) {
                    System.out.println("Não é possível abastecer com essa quantidade de combustível!");
                } else {
                    getTanqueCombustivel().setQuantidadeCombustivel(getTanqueCombustivel().getQuantidadeCombustivel() + quantidade);
                    System.out.println("O carro foi abastecido com " + quantidade + " litros de " + combustivel);
                }
            }
        } else {
            System.out.println("A quantidade deve ser maior que zero!");
        }
    }

    @Override
    public void arrumarFreios(Freios freios) {
        if (freios == Freios.ABS) {
            System.out.println("Os freios já estão funcionando corretamente!");
        } else {
            setFreios(Freios.ABS);
            */

}
