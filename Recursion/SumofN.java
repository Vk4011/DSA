public class SumofN {
    public static void main(String[] args) {
        System.out.println("\n\t Print sum of first n natural numbers \n");
        int n=5;
        System.out.println("\n\t n(n+1)/2 = "+sum(n));
    }
    public static int  sum(int n) {
        if(n==1){
            return 1;
        }
        int s=n+sum(n-1);
        return s;
    }
    
}



        //     Print sum of first n natural numbers 


        //  n(n+1)/2 = 15





