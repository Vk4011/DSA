
public class B {
    static{
        System.out.println("\n\t Welcome to Bank \n");
    }
    final public static void main(String ...a) {
        try{
        U u=new U();
        u.p();
        }
        catch(Exception e){
            System.out.println("\n\t Transcation Failed ...! \n");
            throw e;
        }
        finally{
            System.out.println("\n\t Farud dected Acess denied \n");
        }

    }
    
}


// Welcome to Bank


//          UPI  NetBanking


//          Connection establishing with Bank


//          Please Enter the amount : five

//          Invalid Input the exception handled


//          Transcation Failed ...!


//          Farud dected Acess denied

// Exception in thread "main" java.util.InputMismatchException
//         at java.base/java.util.Scanner.throwFor(Scanner.java:939)
//         at java.base/java.util.Scanner.next(Scanner.java:1594)
//         at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
//         at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
//         at U.p(U.java:15)
//         at B.main(B.java:9)
















