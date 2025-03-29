public class RetosNumericos {
    public static void main(String[] args) {
        final int LIMITE = 50;
        long[] fibonacci = new long[LIMITE];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < LIMITE; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        System.out.println("Los primeros " + LIMITE + " números de la secuencia Fibonacci:");
        for (int i = 0; i < LIMITE; i++) {
            System.out.println((i+1) + ": " + fibonacci[i]);
        }
    }

}
