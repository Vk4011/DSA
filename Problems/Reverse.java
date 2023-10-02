import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("\n\t Reverse number \n");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Enter a num : ");
        int n=sc.nextInt();
        System.out.println("\n\t The number : "+n);
        reverse(n);

    }
    public static void reverse(int x) {
        int rev=0;
        while(x>0){
            int ld=x%10;
            rev=(rev*10)+ld;
            x=x/10;
        }
        System.out.println("\n\t Reverse num : "+rev);
        
    }

}
            output:

            
         Reverse number


         Enter a num :
12345

         The number : 12345

         Reverse num : 54321





         