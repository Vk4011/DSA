public class Fibonacci {
    private static long[] fibonacciCache;
    public static void main(String[] args) {
        System.out.println("\n\t Fibonacci serires \n");
        int n=8;
        
        fibonacciCache = new long[n+1];
        for(int i=0 ; i<=n ;i++){
             System.out.print("\t "+fibonacci(i)+" ");
        
        }
       
        
        
    }
    private static long fibonacci(int n){
        if(n<=1){// base case 
            return n;
        }
        if(fibonacciCache[n]!=0){//premitive are not be null
            return fibonacciCache[n];
        }
        long nthFibonacciNumber = (fibonacci(n-1)+fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;
        return (fibonacci(n-1)+fibonacci(n-2));
    }
}
// 0 1
// 0 1 1 2 3 5 8 13 21 34 55 //Stack over flow error use base case
//f(n)=f(n-1)+f(n-2)
            output:

            
         Fibonacci serires 


         Fibonaci series : 5


        
         Fibonacci serires


         Fibonaci series : 12586269025


               Fibonacci serires 

         0       1       1       2       3       5       8       13      21 