import java.util.Random;

class Carro extends Thread {
    private String nome;
    private static final int DISTANCIA_TOTAL = 10;
    private static boolean vencedorDeclarado = false;
    private static final Object lock = new Object();

    public Carro(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 1; i <= DISTANCIA_TOTAL; i++) {
            try {
                Thread.sleep(500 + random.nextInt(501)); // 500ms a 1000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(nome + " está na posição " + i);

            if (i == DISTANCIA_TOTAL) {
                synchronized (lock) {
                    if (!vencedorDeclarado) {
                        vencedorDeclarado = true;
                        System.out.println("🏁 " + nome + " venceu a corrida!");
                    }
                }
            }
        }
    }
}

public class CorridaCarros {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Carro 1");
        Carro carro2 = new Carro("Carro 2");
        Carro carro3 = new Carro("Carro 3");

        carro1.start();
        carro2.start();
        carro3.start();

        try {
            carro1.join();
            carro2.join();
            carro3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Corrida encerrada. Todos os carros chegaram ao final!");
    }
}
