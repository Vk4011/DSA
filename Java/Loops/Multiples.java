import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do{
        System.out.println("\n\t Enter your number : ");
            int n=sc.nextInt();

            if(n%10 == 0){
                continue;
            }
            System.out.println("\n\t number was :"+n);
    
    }while(true);
    
    }
    
}
