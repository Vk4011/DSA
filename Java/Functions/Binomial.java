import java.util.Scanner;

public class Binomial {
    public static int factorial(int v) {
        int f = 1;
        for (int i = 1; i <= v; i++) {
            f*=i;//f=f*i
        }
        return f;
    }
    public static double BinomialCofficentc(int n, int r){
        double fact_n=factorial(n);
        double fact_r=factorial(r);
        double fact_nmr=factorial(n-1);
        double bc=(double)fact_n/(fact_r*fact_nmr);
        return bc;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\t Binomial coffiecent of NcR \n");
        System.out.println("\n\t  Enter n value : ");
        int n=input.nextInt();
         System.out.println("\n\t Enter r value : ");
        int r=input.nextInt();
        double ans=(int) BinomialCofficentc(n,r);// without using type cast (init) we get output is 2.5
        System.out.println("\n\t The binomial coffiecent :  "+ans);



    }
}


// output:
//          Binomial coffiecent of NcR


//           Enter n value :
// 5

//          Enter r value :
// 2

//          The binomial coffiecent :  2.0