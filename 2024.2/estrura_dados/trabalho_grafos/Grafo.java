import java.util.Map;
import java.util.TreeMap;

public class Grafo {
    private Map<String, Vertice> vertices;

    public Grafo(){
        vertices = new TreeMap<String, Vertice>();        
    }

    public void addVertice(String nome){
        vertices.putIfAbsent(nome, new Vertice(nome));
    }

    public void addAresta(String origem, String destino, Integer perigo, Integer distancia){
        vertices.get(origem).addAdjacencia(destino, perigo, distancia);
    }

    public Vertice getVertice(String nome){
        return vertices.get(nome);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Vertice v : vertices.values()) {
            sb
                .append(v.getNome())
                .append("->")
                .append("[")
                .append(v.printAdjacencias())
                .append("]")
                .append("\n");
        }
        return sb.toString();
    }
}