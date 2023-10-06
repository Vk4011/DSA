public class TrilingO {
    private static int  Consective(int n){
       int r=0;
        while(n>0){
            r=r+n/5;
            n=n/5;
        }
        System.out.println("\n\t result : "+r);
        return r;
    }
    public static void main(String[] args) {
        System.out.println("\n\t Triling zero's \n");
        int n=10;
        fact(n);
        Consective(n);

    }
    public static void fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println("\n\t Factorial of a num : "+f);
    }
    
}
                        output:

                        Triling zero's


         Factorial of a num : 3628800

         result : 2




         


