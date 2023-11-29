import java.util.Scanner;

public class Ebanking {
    static {
        System.out.println("\n\t EBanking services \n");
    }

   public void transactions() {
        System.out.println("\n\t Login in to account \n");
        try {
            Scanner sc = new Scanner(System.in);
            int amt;
            while (true) {
                System.out.print("\n\t Please Enter the amount : ");
                if (sc.hasNextInt()) {
                    amt = sc.nextInt();
                    break;
                } else {
                    System.out.println("\n\t Please enter a valid integer amount.");
                    sc.next(); // Clear the invalid input
                }
            }
            System.out.print("\n\t Amount was debited : " + amt + "$");
        } catch (Exception e) {
            System.out.println("\n\t Exception handled\n ");
            e.printStackTrace();
        }
        System.out.println("\n\t Log out from account \n");
    }
}
