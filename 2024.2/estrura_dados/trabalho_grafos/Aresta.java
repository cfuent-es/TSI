public class Aresta {
    private Integer perigo;
    private Integer distancia;

    public Aresta(Integer perigo, Integer distancia) {
        this.perigo = perigo;
        this.distancia = distancia;
    }

    public Integer getPerigo() {
        return perigo;
    }

    public Integer getDistancia() {
        return distancia;
    }

    @Override
    public String toString() {
        return perigo + ", " + distancia;
    }
}