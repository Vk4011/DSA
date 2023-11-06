public class Main{
    public static void main(String[] args) {
        System.out.println("\n\t A number should only divisible by 1 and itself \n");
        int n=36;
        Main p = new Main();
        for(int i=1;i<=n;i++){
            System.out.println("\n\t "+i+" "+p.isPrime(i));

        }
        Prime s=new Prime();
       
        int x=40;
        boolean b[] = new boolean[x+1];

        int r =(int)s.sieve(x, b);
        System.out.println("\n\t Sum of prime numbers : "+r);

    }
    boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}






        // A number should only divisible by 1 and itself 


        //  1 false

        //  2 true

        //  3 true

        //  4 false

        //  5 true

        //  6 false

        //  7 true

        //  8 false

        //  9 false

        //  10 false

        //  11 true

        //  12 false

        //  13 true

        //  14 false

        //  15 false

        //  16 false

        //  17 true

        //  18 false

        //  19 true

        //  20 false

        //  21 false

        //  22 false

        //  23 true

        //  24 false

        //  25 false

        //  26 false

        //  27 false

        //  28 false

        //  29 true

        //  30 false

        //  31 true

        //  32 false

        //  33 false

        //  34 false

        //  35 false

        //  36 false














