package p050;

import java.util.ArrayList;
import java.util.List;

public class P002SumOfEvenFibonacci {

    private static final int LIMIT = 4000000;

    private static List<Integer> generateFibonacci(int limit) {
        List<Integer> f = new ArrayList<>();
        f.add(1);
        f.add(1);
        int index = 1;
        while (f.get(index) <= limit) {
            f.add(f.get(index) + f.get(index - 1));
            index++;
        }
        return f;
    }


    public static void main(String[] args) {
        int sum = generateFibonacci(LIMIT)
            .stream()
            .filter(it -> it % 2 == 0)
            .reduce(0, (a, b) -> a + b);
        System.out.println("sum even fibonacci  = " + sum);
    }
}
