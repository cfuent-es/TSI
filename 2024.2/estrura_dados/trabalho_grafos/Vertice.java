import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Vertice implements Comparable<Vertice> {
    private Integer id;
    private String nome;
    private Map<Integer, Vertice> adjacencias;

    public Vertice(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.adjacencias = new TreeMap<Integer, Vertice>();
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Set<Integer> getAdjacenciasPorId(){
        return adjacencias.keySet();
    }

    public Collection<Vertice> getAdjacenciasPorValor(){
        return adjacencias.values();
    }

    public void addAdjacencia(Vertice vertice) {
        adjacencias.putIfAbsent(vertice.getId(), vertice);
    }

    @Override
    public int compareTo(Vertice outro) {
        return this.id.compareTo(outro.id);
    }

    @Override
        public String toString() {
        return "Vertice [id=" + id + ", nome=" + nome + "]";
    }
}