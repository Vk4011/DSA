import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("\n\t Palindrome of number \n");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Enter a num : ");
        int x=sc.nextInt();
        System.out.println("\n\t The number : "+x);
        boolean result=pal(x)?true:false;
        System.out.println(result?"\n\t it is palindrome ":"\n\t Not a palindrome ");


    }
    public static boolean pal(int n) {
        int original=n;
        int duplicate=0;
        if(n<0){
            System.out.println("\n\t No -ve value \n");
            return false;
        }
        while(n>0){
            int ld=n%10;
            duplicate=(duplicate*10)+ld;
            n=n/10;
        }
        
        return original==duplicate;

    }
    
}
            output:

             Palindrome of number 


         Enter a num : 
-121

         The number : -121

         No -ve value 


         Not a palindrome 



         