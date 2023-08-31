import java.util.Scanner;

public class Method{
    public static void main(String[] args) {
        sum();
        sum();
        sum();
      
        int ans = sum2();
        System.out.println(ans);
    
    }
    //Return type int . return the value 
     static  int sum2(){
        Scanner in=new Scanner (System.in);
        int num1,num2,s;
        System.out.println("\n\t Enter number 1: ");
        num1=in.nextInt();
        System.out.println("\n\t Enter number 2: ");
        num2=in.nextInt();
        s=num1+num2;
        return s;//After using the return type nothing will execute 
        // System.out.println("\n\t This will never execute \n");
        //Dry run  don't repeat your self so we use functions are  methods
    
    }
    


    static  void sum(){//static method doesn't depend on object 
            Scanner in=new Scanner (System.in);
        int num1,num2,sum;
        System.out.println("\n\t Enter number 1: ");
        num1=in.nextInt();
        System.out.println("\n\t Enter number 2: ");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("\n\t The sum = "+sum);
        //Dry run  don't repeat your self so we use functions are  methods
    
    }
    

}