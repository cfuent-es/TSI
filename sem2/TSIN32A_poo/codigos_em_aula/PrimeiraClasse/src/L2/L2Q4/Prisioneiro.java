//package L2.L2Q4;

public class Prisioneiro {
    Crime crime;
    String nome;

    public Prisioneiro(String nome, Crime crime){
        this.nome = nome;
        this.crime = crime;
    }

    public String getNome(){
        return nome;
    }

    public Crime getCrime(){
        return crime;
    }
}
