public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private Integer ano;
    private Double nota;
    private Double preco;
    private Double custo_beneficio;

    public Livro(String titulo, String autor, Integer ano, Double nota, Double preco, Double custo_beneficio)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.nota = nota;
        this.preco = preco;
        this.custo_beneficio = custo_beneficio;
    }

    public Livro(String titulo, String autor, Integer ano, Double nota, Double preco) {
        this(titulo, autor, ano, nota, preco, ((nota*0.5) + (preco * 0.5)));
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

    public Double getCustoBeneficio(){
        return custo_beneficio;
    }

    @Override
    public int compareTo(Livro livro){
        return this.titulo.compareTo(livro.titulo);
    }
}