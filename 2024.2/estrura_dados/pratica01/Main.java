import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Livro[] livros = {
            new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 4.9, 50.0),
            new Livro("1984", "George Orwell", 1949, 4.8, 30.0),
            new Livro("Duna", "Frank Herbert", 1965, 4.7, 45.0),
            new Livro("Neuromancer", "William Gibson", 1984, 4.5, 40.0),
            new Livro("Fahrenheit", "Ray Bradbury", 1953, 4.6, 35.0)
        };

        Arrays.sort(livros);

        System.out.println("Ordenados por título (ordem crescente):");
        for(int i = 0; i < livros.length; i++){
            System.out.print(livros[i].getTitulo());
            if (i < livros.length -1)
                System.out.print(", ");
        }

        System.out.println();
    }
}