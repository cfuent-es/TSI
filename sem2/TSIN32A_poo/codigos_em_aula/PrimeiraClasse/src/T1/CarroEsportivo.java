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

        return true;
    }
/* */
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
