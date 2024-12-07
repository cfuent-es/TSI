public class Acao {
    private String tipo;
    private String acao;

    public Acao(String tipo, String acao){
        this.tipo = tipo;
        this.acao = acao;
    }

    public String getTipo()
    {
        return this.tipo;
    }

    public String getAcao()
    {
        return this.acao;
    }

    @Override
    public String toString(){
        return this.tipo + " - " + this.acao;
    }
}