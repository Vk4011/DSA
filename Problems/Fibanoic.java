import java.util.*;

public class Fibanoic {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("\n\t Enter a number : ");
        n = sc.nextInt();

        int f[] = new int[n];

        f[0]=0;
        f[1]=1;

        for(int i=2;i<n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        System.out.println("\n\t Fibonacci Series : ");
        for(int i=0;i<n;i++){
            System.out.println(f[i]+" ");
        }
        System.out.println("\n\t Fibonic series method 2\n");
        int result=fib(n);
        System.out.println("\n\t Fibonanic  digit : "+result);
    }
    private static int fib(int x){
        int f=0;
        int s=1;
        if(x<0){
            System.out.println("\n\t -negative value \n");
        }
        for(int i=2;i<x;i++){
        int r=f+s;
        f=s;
        s=r;
        }
        return s;
    }
}       


            output:


            
         Enter a number :
5

         Fibonacci Series :
0 
1
1 
2
3

         Fibonic series method 2


         Fibonanic  digit : 3






         