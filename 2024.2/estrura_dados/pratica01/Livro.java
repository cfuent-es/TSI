public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private Integer ano;
    private Double nota;
    private Double preco;

    public Livro(String titulo, String autor, Integer ano, Double nota, Double preco)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.nota = nota;
        this.preco = preco;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
     
    public Integer getAno(){
        return ano;
    }

    public Double getNota(){
        return nota;
    }

    public Double getPreco(){
        return preco;
    }

    @Override
    public int compareTo(Livro livro){
        return this.titulo.compareTo(livro.titulo);
    }
}