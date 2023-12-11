package L2.L2Q4;

public class Bangu {
    int capacidade;
    int populacao = 0;

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
        
    }

    public void hospedar(Prisioneiro prisioneiro){
        if(populacao < capacidade){
            System.out.println("prisioneiro " + prisioneiro.nome + " - condenado por " + prisioneiro.crime + " - preso no Bangu");
            populacao++;
        }
        else{
            throw new RuntimeException("Bagu nao pode mais receber prisioneiros");
        }
    }
}
