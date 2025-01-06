class Votacao {
    private String cidade;
    private Integer qtdVotos;

    public Votacao(String cidade, Integer qtdVotos){
        this.cidade = cidade;
        this.qtdVotos = qtdVotos;
    }

    public String getCidade(){
        return cidade;
    }

    public Integer getQtdVotos(){
        return qtdVotos;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Votacao votacao = (Votacao) obj;
        return cidade.equals(votacao.getCidade());
    }

    @Override
    public String toString(){
        return cidade + ": recebeu " + qtdVotos + " votos";
    }
}