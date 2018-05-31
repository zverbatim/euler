package p050;


import java.util.stream.IntStream;

public class P001MultiplesOf3And5 {

    public static void main(String[] args) {
        Integer product =  IntStream.range(3, 1000)
            .filter(it -> it % 3 == 0 || it % 5 == 0)
            .sum();
        System.out.println("product = " + product);
    }
}
