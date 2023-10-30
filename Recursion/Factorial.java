public class Factorial {
    public static void main(StringReverse[] args) {
        System.out.println("\n\t Factorial of a number \n");
        int n=5;
        // fact(n);
        System.out.println("\n\t factorial of "+n+"! : "+fact(n));
    }
    public static int fact(int n) {
        if(n == 0){

            return 1;
        }
        int fn = n * fact(n-1);
        System.out.print(" * "+fn+" ");
        return fn;
    }
    
}

//              Factorial of a number

//  * 1  * 2  * 6  * 24  * 120 
//          factorial of 5! : 120




