package p050


class P003LargestPrimeFactor {

    final static long LIMIT = 600_851_475_143
    static Map<Long, Integer> numbers = new HashMap<>()


    private static markPrimeMultiples(long current) {
        for (long i = current; i < numbers.size(); i += current) {
            numbers[i] = 1
        }
    }

    private static findNextPrime(long current) {
        long i = current + 1L
        while (i < numbers.size() && numbers[i] == 1) {
            i++
        }
        return i
    }

    private static List<Long> sieve() {
        // init numbers
        for (int i = 0; i < LIMIT; i++) {
            numbers[i] = 0
        }

        List<Long> primes = new ArrayList<>()
        int current = 2
        while (current < LIMIT) {
            primes.add(current)
            markPrimeMultiples(current)
            current = findNextPrime(current)
        }

        return primes
    }

    static void main(String[] args) {
        List<Long> primes = sieve()
        println "primes = " + primes

        println "max prime factor =" + primes.stream()
                .filter { it -> LIMIT % it == 0L }
                .collect()
                .max()

    }
}
