import java.util.Scanner;

public class Function {

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f*=i;//f=f*i
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println("\n\t Factorial of number");
        Scanner input=new Scanner (System.in);
        System.out.println("\n\t Enter a num: ");
        int f=input.nextInt();
        double  fact=factorial(f);
        System.out.println("\n\t Factorial is :" +fact);

    }

}

output:
  Factorial of number

         Enter a num:
                        6

         Factorial is :720.0



         ...