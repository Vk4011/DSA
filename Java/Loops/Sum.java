import java.util.*;
public class Sum {
    public static void main(String[] args) {
        System.out.println("\n\t Sum of n natural numbers ");
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("\n\t Enter number : "+n);
        int sum=0;
        for(int i=1; i<=n;i++){
            sum+=i;
            System.out.println("\n\t Sum : "+sum);
        }
        System.out.println("\n\t Sum "+n+" natural :"+sum);
        System.out.println("\n\t Product of n natural numbers ");
        int p=1,j=1;

        while(j<=n){
            p=p*j;
            j++;
        }
        System.out.println("\n\t Product  :"+p);
    }
}    

// output:

//          Sum of n natural numbers
// 4

//          Enter number : 4

//          Sum : 1

//          Sum : 3

//          Sum : 6

//          Sum : 10

//          Sum 4 natural :10

//          Product of n natural numbers

//          Product  :24