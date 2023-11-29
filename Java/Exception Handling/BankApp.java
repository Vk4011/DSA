import java.util.Scanner;

/**
 *  EBanking
 
 void transaction(){
    */
 class  EBanking {
    void transaction(){
        System.out.println("\n\t Login in to account \n ");
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\t Please enter amount : ");
        int a=sc.nextInt();
        System.out.println("\n\t Amount debited : "+a+" $");
        System.out.println("\n\t Log out from account \n");

    }
    
}

class BankApp {
    final static public void main(String...a){
        System.out.println("\n\t Main is executing \n");
        EBanking u=new EBanking();
        System.out.println(u);
        u.transaction();
    }
}


//   Main is executing

// EBanking@36baf30c

//          Login in to account


//          Please enter amount : 3500

//          Amount debited : 3500 $

//          Log out from account













