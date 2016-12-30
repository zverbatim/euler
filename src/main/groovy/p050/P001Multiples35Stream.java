package p050;

import java.util.stream.IntStream;
public class P001Multiples35Stream {

    static private int sum( int limit, int hop){

        return IntStream.range(0, limit)
                .filter(n -> n % hop == 0 )
                .sum();
    }

    public static void main(String[] args) {
        int limit = 10;
        int s3 = sum(limit, 3);
        int s5 = sum(limit, 5);
        int s15 = sum(limit, 15);
        int sum = s3 + s5 - s15;
        System.out.println("Limit = " +  limit);
        System.out.println("Sum of all multiples of 3 and 5 = " + sum);
    }
}
