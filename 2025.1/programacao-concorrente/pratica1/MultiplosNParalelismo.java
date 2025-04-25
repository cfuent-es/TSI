class Sequencial extends Thread {
    int inicial;
    int n_final;
    int num;
    int qtd = 0;

    public Sequencial (int inicial, int n_final, int num) {
        this.inicial = inicial;
        this.n_final = n_final;
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = inicial; i <= n_final; i++) {
            if (i % num == 0) {
                qtd++;
            }
        }
        System.out.println("Programa " + inicial + " a " + n_final + " - Qtd: " + qtd);
    }
}

class MultiplosNParalelismo {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        Sequencial seq1 = new Sequencial(1, 100000, num);
        Sequencial seq2 = new Sequencial(100001, 200000, num);
        Sequencial seq3 = new Sequencial(200001, 300000, num);
        Sequencial seq4 = new Sequencial(300001, 400000, num);

        seq1.start();
        seq2.start();
        seq3.start();
        seq4.start();

        try {
            seq1.join();
            seq2.join();
            seq3.join();
            seq4.join();

            System.out.println("Total de números contatos: " + (seq1.qtd + seq2.qtd + seq3.qtd + seq4.qtd));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}