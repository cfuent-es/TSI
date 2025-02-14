import java.util.Map;
import java.util.TreeMap;

public class Vertice implements Comparable<Vertice> {
    private String nome;
    public Map<String, Aresta> adjacencias;

    public Vertice(String nome) {
        this.nome = nome;
        this.adjacencias = new TreeMap<String, Aresta>();
    }

    public String getNome() {
        return nome;
    }

    public String printAdjacencias() {
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, Aresta> entry : adjacencias.entrySet()) {
            sb
                .append("[")
                .append(entry.getKey())
                .append(", ")
                .append(entry.getValue())
                .append("]")
                .append(", ");
        }
        // Remove the last ", " if it exists
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }

    public void addAdjacencia(String destino, Integer perigo, Integer distancia) {
        adjacencias.put(destino, new Aresta(perigo, distancia));
    }

    @Override
    public int compareTo(Vertice outro) {
        return this.nome.compareTo(outro.nome);
    }

    @Override
        public String toString() {
        return "Vertice [" + nome + "]";
    }
}