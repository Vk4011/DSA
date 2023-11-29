

import java.util.Scanner;


public class U {
    static{
        System.out.println("\n\t UPI  NetBanking \n");
        System.out.println("\n\t Connection establishing with Bank \n");
    }
    void p(){
        try{
        System.out.print("\n\t Please Enter the amount : ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("\n\t The Amount : "+a+"$");
        }
        catch(Exception e){
            System.out.println("\n\t Invalid Input the exception handled \n");
            throw e;
        }
        System.out.println("\n\t Connection ended with bank \n");
    }
}
