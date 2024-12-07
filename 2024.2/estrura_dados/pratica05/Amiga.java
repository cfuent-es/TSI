import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
    public int hashCode() {
        return Objects.hash(numeroRegistro, nome);
    }

    @Override
    public String toString() {
        return nome + " (Registro: " + numeroRegistro + ")";
    }
}

public class Eventos {
    public static void main(String[] args) {
        String caminhoArquivo = "eventos.csv";
        Map<String, Set<Participante>> eventosMap = new HashMap<>();
        Set<Participante> todosParticipantes = new TreeSet<>(Comparator.comparing(Participante::getNome));

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine(); // Ignorar o cabeçalho
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int registro = Integer.parseInt(dados[0].trim());
                String nome = dados[1].trim();
                String evento = dados[2].trim();

                Participante participante = new Participante(registro, nome);

                eventosMap.putIfAbsent(evento, new TreeSet<>());
                eventosMap.get(evento).add(participante);
                todosParticipantes.add(participante);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Exibir todos os participantes ordenados por nome
        System.out.println("Participantes ordenadas por nome:");
        todosParticipantes.forEach(System.out::println);

        // Participantes que participaram de eventoA e eventoB
        Set<Participante> eventoA = eventosMap.getOrDefault("eventoA", new TreeSet<>());
        Set<Participante> eventoB = eventosMap.getOrDefault("eventoB", new TreeSet<>());

        Set<Participante> intersecaoAB = new TreeSet<>(eventoA);
        intersecaoAB.retainAll(eventoB);

        System.out.println("\nParticipantes que participaram do evento A e também do evento B:");
        intersecaoAB.forEach(System.out::println);

        // Participantes que não participaram de eventoC
        Set<Participante> eventoC = eventosMap.getOrDefault("eventoC", new TreeSet<>());

        Set<Participante> naoParticiparamC = new TreeSet<>(todosParticipantes);
        naoParticiparamC.removeAll(eventoC);

        System.out.println("\nParticipantes que não participaram do evento C:");
        naoParticiparamC.forEach(System.out::println);
    }
}
