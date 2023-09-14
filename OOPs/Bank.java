public class Bank {
    public static void main(String[] args) {
        System.out.println("\n\t Bank \n");
        BankAccount myAcc = new BankAccount();
        myAcc.username="Vikramram";
        myAcc.password="abcdefg";
        System.out.println("\n\tAccount name : "+myAcc.username);
        System.out.println("\n\tPassword     :  "+myAcc.password);
        System.out.println("\n\t Account");
        Account a=new Account();
        System.out.println(a.setUser("vik"));
}
}

class BankAccount{
    public String username;
    String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Account{
    public String user;
    
    public void setUser(String s){
        user=s;
    }
    String pass;
    public void setPass(String p){
        pass=p;
    }

}