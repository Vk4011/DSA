public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("\n\t Fibonacci serires \n");
        int n=5;
        System.out.println("\n\t Fibonaci series : "+fibonacci(n));
        
        
    }
    private static long fibonacci(int n){
        if(n<=1){// base case 
            return n;
        }
        return (fibonacci(n-1)+fibonacci(n-2));
    }
}
// 0 1
// 0 1 1 2 3 5 8 13 21 34 55 //Stack over flow error use base case
//f(n)=f(n-1)+f(n-2)
            output:

            
         Fibonacci serires 


         Fibonaci series : 5