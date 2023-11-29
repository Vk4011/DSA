package Practise;

import java.util.Scanner;

public class Upi {

    void pay(){
        try{
        System.out.println("\n\t Connection established with bank \n");
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\t Please Enter the amount : ");
        int amt=sc.nextInt();
        System.out.println("\n\t Amount paid = "+amt+"$");
        System.out.println("\n\t Transcation completed \n");
        
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("\n\t Invalid input Exception handled \n");
        }
        System.out.println("\n\t Your are Scammer Acess denied ...\n");

    }
    
}
