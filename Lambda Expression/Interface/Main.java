

import java.util.Scanner;

public class Main {
    final public static void main(String ...a) {
       
        Scanner sc=new Scanner(System.in);
        
        System.out.print("\n\t Enter x : ");        
        int x=sc.nextInt();
        
        System.out.print("\n\t Enter y : ");
        int y=sc.nextInt();


        System.out.printf("\n\t X value : %d",x);
        System.out.printf("\n\t Y value : %d",y);
        
         Myclass obj = new Myclass();

        obj.eat();
        
        int result = obj.cal(x,y);
        System.out.println("\n\t Result : "+result);
        sc.close();

    }

}


//  Enter x : 12

//          Enter y : 16

//          X value : 12
//          Y value : 16
//          Animal is Eating


//          Result : 28

