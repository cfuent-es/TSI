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

            int distancia, velocidade, quantidade, tipoCombustivel;
            switch(opcao){
                case 1:
                    distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a distância a ser percorrida (km): "));
                    velocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a velocidade média (km/h): "));
                    esportivo.andar(distancia, velocidade);
                    break;
                case 2:
                    distancia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a distância a ser percorrida (km): "));
                    velocidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a velocidade média (km/h): "));
                    sedan.andar(distancia, velocidade);
                    break;
                case 3:
                    tipoCombustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de combustível: \n\n" +
                                                                                                "1 - Gasolina \n" +
                                                                                                "2 - Álcool \n" +
                                                                                                "3 - Diesel \n\n" +
                                                                                                "Digite a opção desejada: "));
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de combustível a ser abastecida: "));
                    esportivo.abastecer(quantidade, Combustivel.getCombustivel(tipoCombustivel));
                    break;
                case 4:
                    tipoCombustivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o tipo de combustível: \n\n" +
                                                                                                "1 - Gasolina \n" +
                                                                                                "2 - Álcool \n" +
                                                                                                "3 - Diesel \n\n" +
                                                                                                "Digite a opção desejada: "));
                    quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de combustível a ser abastecida: "));
                    sedan.abastecer(quantidade, Combustivel.getCombustivel(tipoCombustivel));
                    break;
                case 5:
                    esportivo.arrumarFreios(new FreiosABS());
                    break;
                case 6:
                    sedan.arrumarFreios(new FreiosTambor());
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "O Carro Esportivo percorreu " + esportivo.getQuilometragem() + "km");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "O Carro Sedan percorreu " + sedan.getQuilometragem() + "km");
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Obrigado por utilizar o Programa Carros!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
    }
}