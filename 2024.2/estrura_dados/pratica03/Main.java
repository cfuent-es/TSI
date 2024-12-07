import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    
    public static void exibirFilmes(List<Filme> filmes){
        for(Filme filme : filmes){
            if(filme.getAno() > 2003)
                System.out.println(filme);
        }
    }

    public static void main(String[] args) {
        List<Filme> filmes = LeitorCSV.lerArquivo("filmes.csv");

        System.out.println("Filmes ordenados por título (produzidos após 2003):");
        Collections.sort(filmes);
        exibirFilmes(filmes);

        Comparator<Filme> avaliacaoFilme = Comparator.comparing(Filme::getAvaliacao);

        System.out.println("\nFilme com a maior avaliação:");
        System.out.println(Collections.max(filmes, avaliacaoFilme));

        System.out.println("\nFilme com a menor avaliação:");
        System.out.println(Collections.min(filmes, avaliacaoFilme));

        System.out.println("\nFilmes com receita 10 vezes ou mais superior ao orçamento:");
        for(Filme filme : filmes){
            Double multiplicacao = filme.getOrcamento() * 10;

            if(filme.getReceita() > multiplicacao)
                System.out.println(filme);
        }

        System.out.println("\nContagem de filmes por gênero:");

        List<String> generos = new ArrayList<>();

        for(Filme filme : filmes){
            String genero = filme.getGenero();
            if(!generos.contains(genero))
                generos.add(genero);
        }

        for (String genero : generos){
            Integer qtd = 0;
            for(Filme filme : filmes){
                if(filme.getGenero().equals(genero))
                    qtd += 1;
            }
            System.out.println("gênero: " + genero + ", contagem: " + qtd);
        }

    }

}