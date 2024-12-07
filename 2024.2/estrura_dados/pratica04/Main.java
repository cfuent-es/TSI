import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main{

    public static void main(String[] args) {
        List<Acao> acoes = LeitorCSV.lerArquivo("editor.csv");

        Stack<String> pilha = new Stack<String>();
        Queue<String> fila = new LinkedList<String>();

        for (Acao acao : acoes){
            if(acao.getTipo().equals("Feito")){
                pilha.push(acao.getAcao());
            }
            else if(acao.getTipo().equals("Desfeito")){
                fila.add("Desfeito: " + pilha.pop());
            }
        }

        while(!fila.isEmpty()){
            pilha.push(fila.poll());
        }

        while(!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }


    }

}