import javax.swing.*;

class Programa {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Programa Carros!");

        JOptionPane.showMessageDialog(null, "Os seguintes carros estão disponíveis: \n\n" +
                                            "Carro Sedan: \n" +
                                            "Tanque: 120 litros | Freios a Tambor \n\n" +
                                            "Carro Esportivo: \n" +
                                            "Tanque: 80 litros | Freios ABS \n\n" );

        CarroEsportivo esportivo = new CarroEsportivo(0, new TanqueCombustivel(Combustivel.GASOLINA, 80), new FreiosABS());
        CarroSedan sedan = new CarroSedan(0, new TanqueCombustivel(Combustivel.GASOLINA, 120), new FreiosTambor());

        int opcao = 0;

        while(opcao != 9)
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n\n" +
                                                                        "1 - Andar com o Carro Esportivo \n" +
                                                                        "2 - Andar com o Carro Sedan \n" +
                                                                        "3 - Abastecer o Carro Esportivo \n" +
                                                                        "4 - Abastecer o Carro Sedan \n" +
                                                                        "5 - Arrumar os Freios do Carro Esportivo \n" +
                                                                        "6 - Arrumar os Freios do Carro Sedan \n" +
                                                                        "7 - Verificar a Quilometragem do Carro Esportivo \n" +
                                                                        "8 - Verificar a Quilometragem do Carro Sedan \n" +
                                                                        "9 - Sair \n\n" +
                                                                        "Digite a opção desejada: "));

            
        }
    }
}