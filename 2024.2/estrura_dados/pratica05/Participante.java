class Participante implements Comparable<Participante> {
    private int numeroRegistro;
    private String nome;

    public Participante(int numeroRegistro, String nome) {
        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Participante outro) {
        return Integer.compare(this.numeroRegistro, outro.numeroRegistro);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participante that = (Participante) obj;
        return numeroRegistro == that.numeroRegistro && nome.equals(that.nome);
    }

    @Override
    public String toString() {
        return nome + " (Registro: " + numeroRegistro + ")";
    }
}