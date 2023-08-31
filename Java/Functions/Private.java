import java.util.Scanner;

public class Private {

    private static String funs(String name) {
        String message = "Hello " + name;
        return message;

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\n\tAfter swapping inside the function:\n");
        System.out.println("\n\ta = " + a + ", b = " + b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String op = funs("vikram");
        System.out.println("\n\t" + op + "\n");
        System.out.println("\n\t Swapping two nums\n");
        System.out.println("\n\t Enter a value : ");
        int num1 = sc.nextInt();
        System.out.println("\n\t Enter b value : ");
        int num2 = sc.nextInt();

        System.out.println("\n\t Before swapping:");
        System.out.println("\n\tnum1 = " + num1 + ", num2 = " + num2);

        swap(num1, num2);

        // System.out.println("After swapping inside the function:");
        // System.out.println("a = " + num1 + ", b = " + num2);

    }
}
