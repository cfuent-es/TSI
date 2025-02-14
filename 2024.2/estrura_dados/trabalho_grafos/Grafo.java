import java.util.*;

public class Grafo {
    private Map<String, Vertice> vertices;

    public Grafo(){
        vertices = new TreeMap<String, Vertice>();        
    }

    public void addVertice(String nome){
        vertices.putIfAbsent(nome, new Vertice(nome));
    }

    public void addAresta(String origem, String destino, Integer perigo, Integer distancia){
        Aresta aresta = vertices.get(origem).adjacencias.get(destino);
        if(aresta != null){
            int distanciaPerigoAnterior = aresta.getDistancia() * (1 + aresta.getPerigo());
            int distanciaPerigoAtual = distancia * (1 + perigo);
            if(distanciaPerigoAtual < distanciaPerigoAnterior){
                vertices.get(origem).addAdjacencia(destino, perigo, distancia);
            }
        } else {
            vertices.get(origem).addAdjacencia(destino, perigo, distancia);
        }
    }

    public Vertice getVertice(String nome){
        return vertices.get(nome);
    }

    public List<String> getVertices() {
        return new ArrayList<>(vertices.keySet());
    }

    public boolean buscaProfundidade(String origem, String destino){
        System.out.println("\n\n### -- BUSCA EM PROFUNDIDADE -- ###");
        LoadingAnimation.showLoadingAnimation(3);
        boolean caminho = false;

        Set<String> visitados = new HashSet<>();
        Stack<String> pilha = new Stack<>();

        pilha.push(origem);

        while(!pilha.isEmpty()){
            String vertice = pilha.pop();

            if(vertice.equals(destino)){
                caminho = true;
                break;
            }

            if(!visitados.contains(vertice)){
                visitados.add(vertice);

                Vertice vertice_atual = vertices.get(vertice);
                for(String vizinho: vertice_atual.adjacencias.keySet()){
                    if(!visitados.contains(vizinho)){
                        pilha.push(vizinho);
                    }
                }
            }
        }
        return caminho;
    }

    public boolean buscaLargura(String origem, String destino){
        System.out.println("\n\n### -- BUSCA EM LARGURA -- ###");
        LoadingAnimation.showLoadingAnimation(3);

        boolean caminho = false;

        Set<String> visitados = new HashSet<>();
        Queue<String> fila = new LinkedList<>();

        fila.add(origem);

        while(!fila.isEmpty()){
            String vertice = fila.poll();

            if(vertice.equals(destino)){
                caminho = true;
                break;
            }

            if(!visitados.contains(vertice)){
                visitados.add(vertice);

                Vertice vertice_atual = vertices.get(vertice);
                if (vertice_atual != null) {
                    for(String vizinho: vertice_atual.adjacencias.keySet()){
                        if(!visitados.contains(vizinho)){
                            fila.add(vizinho);
                        }
                    }
                }
            }
        }

        return caminho;
    }

    public void getRoutes(String origem, String destino) {
        System.out.println("\n\nReino de Origem: " + origem);
        System.out.println("Reino de Destino: " + destino);

        LoadingAnimation.waitForSeconds(3);
        
        System.out.println("Caminho encontrado? " + buscaProfundidade(origem, destino));
        
        System.out.println("Caminho encontrado? " + buscaLargura(origem, destino));

        System.out.println("Caminho mais curto: " + buscaDijkstra(origem, destino));


    }

    public String buscaDijkstra(String origem, String destino){
        System.out.println("\n\n### -- ALGORITMO DE DIJKSTRA -- ###");
        LoadingAnimation.showLoadingAnimation(3);

        Map<String, Integer> distancias = new TreeMap<String, Integer>();
        Map<String, Integer> perigos = new TreeMap<String, Integer>();

        for(String vertice: vertices.keySet()){
            distancias.put(vertice, Integer.MAX_VALUE);
            perigos.put(vertice, Integer.MAX_VALUE);
        }
        distancias.put(origem, 0);
        perigos.put(origem, 0);

        Stack<String> pilha = new Stack<>();
        Set<String> visitados = new HashSet<>();

        pilha.push(origem);

        while(!pilha.isEmpty()){
            String vertice = pilha.pop();

            if(!visitados.contains(vertice)){
                visitados.add(vertice);

                Vertice vertice_atual = vertices.get(vertice);
                for(String vizinho: vertice_atual.adjacencias.keySet()){
                    if(!visitados.contains(vizinho)){
                        pilha.push(vizinho);
                    }

                    Aresta aresta = vertice_atual.adjacencias.get(vizinho);
                    Integer distancia = distancias.get(vertice) + aresta.getDistancia();
                    Integer perigo = perigos.get(vertice) + aresta.getPerigo();

                    if(distancia < distancias.get(vizinho)){
                        distancias.put(vizinho, distancia);
                    }

                    if(perigo < perigos.get(vizinho)){
                        perigos.put(vizinho, perigo);
                    }
                }
            }
        }

        if(Integer.MAX_VALUE == distancias.get(destino)){
            return "Não foi possível encontrar um caminho entre os reinos";
        }

        System.out.println("Distancia total entre os reinos: " + distancias.get(destino));
        System.out.println("Perigo total entre os reinos: " + perigos.get(destino));


        return "Faltou o caminho!!!";
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