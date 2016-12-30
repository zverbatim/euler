package p050

class P002SumEvenFibonacci {

    static final int LIMIT = 4_000_000


    static void main(String[] args) {
        int s = 10
        int fn_2 = 2
        int fn_1 = 8
        int next = fn_1 * 4 + fn_2

        while (next < LIMIT) {
            s += next
            fn_2 = fn_1
            fn_1 = next
            next = fn_1 * 4 + fn_2
            println(", " + next)
        }

        println "sum even fibonacci = " + s
    }
}
