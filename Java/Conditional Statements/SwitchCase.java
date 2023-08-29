import java.util.*;


public class SwitchCase{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\n\t Enter a value :");
        double a=input.nextDouble();
        System.out.println("\n\t Enter b value :");
        int b=input.nextInt();
        System.out.println("\n\t Enter Operator :");
        char operator = input.next().charAt(0);

        switch(operator){
            case '+':
                     System.out.println("\n\t Sum :"+(a+b));
                    break;
            case '-':
                     System.out.println("\n\t Sum :"+(a-b));
                    break;
           case '*':
                     System.out.println("\n\t Sum :"+(a*b));
                    break;         
            case '/':
                     System.out.println("\n\t Sum :"+(a/b));
                    break;
            default: System.out.println("\n\t Wrong Operator");        
        }
    }
}
