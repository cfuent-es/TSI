package T1;

public class FreiosTambor extends Freios{

    private String tipo = "Tambor";

    public FreiosTambor() {
        super(1000);
    }

    public void usarFreios(int distancia, int velocidade) {
        super.usarFreios(distancia, velocidade);
        if(velocidade > 100)
            super.usarFreios(distancia, velocidade);
    }

    public String getTipo() {
        return tipo;
    }
}
