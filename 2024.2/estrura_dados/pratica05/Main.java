import java.util.*;



public class Main {
    public static void main(String[] args) {

        List<Participante> participantesEventoA = LeitorCSV.lerArquivo("eventos.csv", "eventoA");
        List<Participante> participantesEventoB = LeitorCSV.lerArquivo("eventos.csv", "eventoB");
        List<Participante> participantesEventoC = LeitorCSV.lerArquivo("eventos.csv", "eventoC");

        Set<Participante> todosUnicos = new TreeSet<Participante>(Comparator.comparing(Participante::getNome));
        Set<Participante> todosEventoA = new TreeSet<Participante>();
        Set<Participante> todosEventoB = new TreeSet<Participante>();
        Set<Participante> todosEventoC = new TreeSet<Participante>();

        for (Participante participante : participantesEventoA) {
            todosUnicos.add(participante);
            todosEventoA.add(participante);
        }

        for (Participante participante : participantesEventoB) {
            todosUnicos.add(participante);
            todosEventoB.add(participante);
        }

        for (Participante participante : participantesEventoC) {
            todosUnicos.add(participante);
            todosEventoC.add(participante);
        }

        System.out.println("Participantes ordenadas por nome:");
        todosUnicos.forEach(System.out::println);

        Set<Participante> aUniaoB = new TreeSet<Participante>(todosEventoA);
        aUniaoB.retainAll(todosEventoB);
        System.out.println("\nParticipantes que participaram do evento A e também do evento B:");
        aUniaoB.forEach(System.out::println);

        aUniaoB.addAll(todosEventoA);
        aUniaoB.addAll(todosEventoB);
        System.out.println("\nParticipantes que não participaram do evento C:");
        aUniaoB.removeAll(todosEventoC);
        aUniaoB.forEach(System.out::println);
    }
}
