public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("\n\t Print Nth fibonacci number \n");
        System.out.println("\n\t fib : 0 1 1 2 3 5 8 13 21.......... ");
        int n=5;
        System.out.println("\n\t fibonacci of "+n+" : "+fib(n));
    }
    public static int fib(int n) {
        // if(n==0){
        //     return 0;
        // }
        // if(n==1){
        //     return 1;
        // }
        if(n ==0 || n== 1){
            return n;
        }
     int f1=fib(n-1);
     int f2=fib(n-2);
     int fb=f1+f2;
     
     return fb;   
     
    }
    
}

//  Print Nth fibonacci number


//          fib : 0 1 1 2 3 5 8 13 21..........

//          fibonacci of 5 : 5