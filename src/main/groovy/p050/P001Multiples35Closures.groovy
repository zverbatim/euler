package p050

class P001Multiples35Closures {

    static void main(String[] args) {

        Closure sumSequence = { it * (it + 1) / 2 }
        Closure countHop = { int limit, int hop ->
            int c = 0
            int i = hop
            while (i < limit) {
                i += hop
                c++
            }
            return c
        }

        int limit = 1000
        int sum  = sumSequence( countHop(limit, 3)) * 3 + sumSequence( countHop(limit, 5)) * 5 - sumSequence( countHop(limit, 15)) * 15
        println "sum = " + sum
    }

}



