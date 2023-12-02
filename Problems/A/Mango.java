

public class Mango {
    public static void main(String[] args) {
        int mangoes = 2;
        int persons = 2;

        int ways = distributeMangoes(mangoes, persons);
        System.out.println("\n\t Number of ways to distribute mangoes: " + ways);
    }

    public static int distributeMangoes(int mangoes, int persons) {
    
        return nCr(mangoes + persons - 1, persons - 1);
    }

   
    public static int nCr(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        } else {
            int[][] dp = new int[n + 1][r + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= Math.min(i, r); j++) {
                    if (j == 0 || j == i) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    }
                }
            }
            return dp[n][r];
        }
    }
}



        //   Number of ways to distribute mangoes: 3





        