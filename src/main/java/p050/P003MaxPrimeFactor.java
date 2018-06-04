package p050;

public class P003MaxPrimeFactor {

    private static final long LIMIT = 600851475143L;

    public static void main(String[] args) {
        int factor = 2;
        int maxPrimeFactor = 1;

        long number = LIMIT;
        while (number > 1 || number > factor) {
            if (number % factor == 0) {
                maxPrimeFactor = factor;
                while (number % factor == 0 && number > 1) {
                    number /= factor;
                }
            }
            factor++;
        }

        System.out.println("max prime factor " + maxPrimeFactor);
    }
}
