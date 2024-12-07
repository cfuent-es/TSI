import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    /**
     * Essa função exibe todas as contas da lista, uma conta por linha.
     * @param contas - contas lidas do arquivo de entrada.
     */
    public static void exibirContas(List<Conta> contas) {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public static void main(String[] args) {
        List<Conta> contas = LeitorCSV.lerArquivo("contas.csv");
        
        // Exibindo as contas ordenads por id (ordem natural da classe Conta)
        System.out.println("Contas ordenadas por id:");
        Collections.sort(contas);
        exibirContas(contas);

        // Comparando as contas pelo identificador (id)
        System.out.println("\nConsulta por id mais baixo e mais alto:");
        System.out.println("id mais baixo: " + Collections.min(contas));
        System.out.println("id mais alto: " + Collections.max(contas));

        // Implementação de um comparador para o atributo saldo
        Comparator<Conta> saldoComparator = Comparator.comparing(Conta::getSaldo);
        
        System.out.println("\nConsulta por menor e maior saldo:");
        System.out.println("menor saldo: " + Collections.min(contas, saldoComparator));
        System.out.println("maior saldo: " + Collections.max(contas, saldoComparator));

        // Buscando uma conta qualquer por id (ordem natural da classe Conta):
        System.out.println("\nBusca pela conta com id = 820495743:");
        int index = Collections.binarySearch(contas, new Conta("820495743", null, null, null));
        
        if (index >= 0) {
            System.out.println("Conta encontrada: " + contas.get(index));
        } 
        else {
            System.out.println("Conta não encontrada!");
        }
    }
}