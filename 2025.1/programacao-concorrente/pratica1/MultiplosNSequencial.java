class MultiplosNSequencial {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= 400000; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Fim do programa.");
    }
}