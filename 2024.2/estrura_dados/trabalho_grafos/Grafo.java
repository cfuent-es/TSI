import java.util.Map;
import java.util.TreeMap;

public class Grafo {
    private Map<Integer, Vertice> vertices;

    public Grafo(){
        vertices = new TreeMap<Integer, Vertice>();        
    }

    public void addVertice(int id, String nome){
        vertices.putIfAbsent(id, new Vertice(id, nome));
    }

    public void addAresta(int vId, int uId) {
        if (vertices.containsKey(vId) && vertices.containsKey(uId)) {
            vertices.get(vId).addAdjacencia(vertices.get(uId));    
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Vertice v : vertices.values()) {
            sb.append(v.getNome()).append("->").append(v.getAdjacenciasPorValor()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Criando os vértices
        Grafo grafo = new Grafo();
        grafo.addVertice(1, "V1");
        grafo.addVertice(2, "V2");
        grafo.addVertice(3, "V3");
        grafo.addVertice(4, "V4");

        // Criando a lista de adjacências do vertice v1
        grafo.addAresta(1, 2);
        grafo.addAresta(1, 3);

        // Criando a lista de adjacências do vertice v2
        grafo.addAresta(2, 4);

        // Criando a lista de adjacências do vertice v3
        grafo.addAresta(3, 2);

        // Exibindo o grafo
        System.out.println(grafo);
    }
}