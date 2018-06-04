package p050;

public class P004LargestPalindrom {

    private static boolean palindrom(int n) {
        String a = String.valueOf(n);

        StringBuilder sb = new StringBuilder();
        for (int i = a.length() - 1; i >= 0; i--) {
            sb.append(a.charAt(i));
        }

        return a.equals(sb.toString());
    }

    public static void main(String[] args) {

        int maxI = -1;
        int maxJ = -1;
        int max = -1;
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int p = i * j;
                if (palindrom(p)) {
                    if (max < p) {
                        max = p;
                        maxI = i;
                        maxJ = j;
                    }

                    // no need to iterate j further
                    break;
                }
            }
        }

        System.out.println("max palindrome = " + max + " (" + maxI + " * " + maxJ + ")");
    }
}
