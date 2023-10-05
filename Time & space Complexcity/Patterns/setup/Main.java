import java.util.*;

public class Main {
    public static void main(String a[]) {
        System.out.println("\n\t VS setup \n");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        System.out.println("\n\t Number : " + t+"\n");
        p(t);
        scanner.close();
     
    }

    private static void p(int n) {
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print("\t *");
            }
            System.out.println("\n");
        }

    }
}


