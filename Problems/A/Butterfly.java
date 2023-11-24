
import java.util.Scanner;

public class Butterfly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\t Enter the number of rows for butterfly pattern : ");
        int n = scanner.nextInt();

        int star = 0;
        int space = 2 * n - 1;

        for (int i = 1; i < 2 * n; i++) {
            if (i <= n) {
                space -= 2;
                star += 1;
            } else {
                space += 2;
                star -= 1;
            }

            for (int m = 0; m < star; m++) {
                System.out.print("* ");
            }
            for (int k = 0; k < space; k++) {
                System.out.print("  "); // Two spaces for equivalent Python space
            }
            for (int j = 0; j < star; j++) {
                if (j != n - 1) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

//          Enter the number of rows for butterfly pattern : 6
// *                   * 
// * *               * * 
// * * *           * * * 
// * * * *       * * * * 
// * * * * *   * * * * * 
// * * * * * * * * * * * 
// * * * * *   * * * * *
// * * * *       * * * * 
// * * *           * * *
// * *               * *
// *                   *