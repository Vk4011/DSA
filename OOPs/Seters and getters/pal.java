import java.util.Scanner;

public class pal {
    
    static{
        System.out.println("\n\t palindrome digit \n");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        for(int d=0;n!=0;n=n/10){
            d=n;
        r=r*10+d;
        
         
        }
        System.out.println("\n\t The palindrome digit : "+r);
    }
    static{
        System.out.print("\n\t Enter a number :  ");
    }
        
}


        //   palindrome digit


        //  Enter a number :  123

        //  The palindrome digit : 12421



        