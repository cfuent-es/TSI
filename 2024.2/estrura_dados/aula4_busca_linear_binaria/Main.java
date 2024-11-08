
import java.util.Arrays;
import java.util.Random;

class Main {

    public static final int TAMANHO_VETOR = 1000000;

    public int buscaLinear(int[] vetor, int chave){
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == chave) {
                return i;
            }
        }
        return -1;
    }

    public int buscaBinaria(int[] vetor, int chave){
        int inicio = 0, fim = vetor.length -1;
        while (inicio <= fim){
            int meio = inicio + (fim - inicio) / 2;
            if(vetor[meio] == chave) {
                return meio;
            }
            if(vetor[meio] < chave) {
                inicio = meio + 1;
            }
            else {
                fim  = meio - 1;
            }
        }
        return -1;
    }

    public static void embaralha(int[] vetor) {
        Random rand = new Random();
        for(int i = vetor.length -1; i < 0; i--) {
            int indice = rand.nextInt(i + 1);
            int aux = vetor[i];
            vetor[i] = vetor[indice];
            vetor[indice] = aux;
        }
    }

    public static void vetorOrdenado(int[] vet){
        for (int i = 0; i < vet.length; i++){
            vet[i] = i + 1;
        }
    }

    public static void main(String[] args) {
        int [] vet1 = new int[TAMANHO_VETOR];
        Random rand = new Random();

        vetorOrdenado(vet1);

        // cria uma chave aleatoria para pesquisa
        int chave = rand.nextInt(TAMANHO_VETOR);

        // busca linear
        Main mainInstance = new Main();

        long inicio = System.currentTimeMillis();
        int indice = mainInstance.buscaLinear(vet1, chave);
        long fim = System.currentTimeMillis();
        System.out.println("Pesquisa Linear: chave " + chave + " (índice " + indice + ") | tempo de execução: " + (fim - inicio));

        // embaralha vetor
        embaralha(vet1);

        // busca binaria
        inicio = System.currentTimeMillis();
        Arrays.sort(vet1);
        indice = mainInstance.buscaBinaria(vet1, chave);
        fim = System.currentTimeMillis();
        System.out.println("Pesquisa Binária: chave " + chave + " (índice " + indice + ") | tempo de execução: " + (fim - inicio));


    }
}