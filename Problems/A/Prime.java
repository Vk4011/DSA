import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        System.out.println("\n\t Prime numbers \n");
            Scanner sc=new Scanner(System.in);
            System.out.println("\n\t Enter a num  : " );
            int n=sc.nextInt();
            System.out.println(nthprime(n));

    }
    public static boolean is_prime(int n){
        if(n<2){
            return false;

        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int nthprime(int n){
        int prime[]=new int[n];
        int num=2;

        int index=0;
        while (index<n) {
            if(is_prime(num)){
                prime[index]=num;
                index+=1;
            }
            num+=1;

            
        }
        return prime[n-1];
    }
}


//          Prime numbers


//          Enter a num  :
// 11
// 31





