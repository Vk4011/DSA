public class Bank {
    public static void main(String[] args) {
        System.out.println("\n\t Bank \n");
        BankAccount myAcc = new BankAccount();
        myAcc.username="Vikramram";
        myAcc.password="abcdefg";
        System.out.println("\n\tAccount name : "+myAcc.username);
        System.out.println("\n\tPassword     :  "+myAcc.password);
}
}

class BankAccount{
    public String username;
    String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}