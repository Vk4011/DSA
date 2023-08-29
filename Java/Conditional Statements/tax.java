import java.util.*;


public class tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int income = input.nextInt();
        int tax;
        if(income < 500000){
            tax=0;
        }
        else if (income>=500000 && income < 1000000){
            tax = (int)(income*0.2);//type cast
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("\n\t your tax is :"+tax);
    }    
}

// output:
// 120000000

//          your tax is :36000000