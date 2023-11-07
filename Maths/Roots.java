public class Roots {
    public static void main(String[] args) {
        System.out.println("\n\t Find square root of a number n \n");
        int n = 40;
        int p = 3;
        Roots s = new Roots();
        double result = s.sqrt(n, p);
        System.out.println("\n\t Square root : " + result);
        System.out.printf("\n\t Square root : %.3f", result);
    }

    public double sqrt(int n, int p) {
        if (n < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
        }
        
        if (n == 0) {
            return 0;
        }
        
        double s = 0;
        double e = n;
        double root = 0.0;

        while (s <= e) {
            double m = s + (e - s) / 2;
            if (m * m == n) {
                return m;
            }
            if (m * m > n) {
                e = m;
            } else {
                s = m;
            }
        }

        // Precision
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}


