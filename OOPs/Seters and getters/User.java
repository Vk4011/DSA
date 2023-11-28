public class User {
public static void main(String[] args) {
    System.out.println("\n\t User \n");
    Bank b=new Bank();
    int p=12345;
    System.out.println("\n\t Fetching bank balance : "+b.getAmt(p)+"$");
    b.setAmt(p, 2000);
    int a=b.getAmt(p);
    System.out.println("\n\t Amount : "+a+" $");
   
}    
}
