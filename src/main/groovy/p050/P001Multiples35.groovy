package p050

class P001Multiples35{
    static int sumSequence(int n){
        return (n+1) * n / 2
    }

    static int countHop (int limit = 1000, int hop){
        int c = 0
        int i = hop
        while (i < limit){
            i += hop
            c++
        }
        return c
    }

    static void main(String[] args) {
        int sum = sumSequence(countHop(10, 3)) *  3 + sumSequence(countHop(10, 5)) * 5 - sumSequence(countHop(10, 15)) * 15
        println "sum = " + sum
    }
}



