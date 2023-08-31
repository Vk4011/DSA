import java.util.Scanner;

public class Prime {
    
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){//completely diving never be 0 
            isPrime=false;
            break;
            }
          
        }
        return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Check wether prime number or not ");
        System.out.println("\n\t Enter a num : ");
        int v=sc.nextInt();
    
        System.out.println("\n\t it is :  "+ isPrime(v));
    }
    
}
// output:
//          Check wether prime number or not

//          Enter a num :
                     // 5

        //  it is :  true