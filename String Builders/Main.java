import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n\t String Data type  \n");
        Scanner sc = new Scanner (System.in);
        System.out.print("\n\t Enter a string : ");
        String name=sc.nextLine();
        System.out.println("\n\t String name is : "+name);
        System.out.println("\n\t Strings are imutable \n");
        String s1=new String("Vikram");
        String s2="Vikram";
        boolean o=s1==s2?true:false;
        String r=s1.equals(s2)?" equal ":" not equal ";
        System.out.println("\n\t The value of the 2 strings are : "+r);
        System.out.println("\n\t The string types are not equal  "+o);
    }
}

// String Data type


//          Enter a string : vikram

//          String name is : vikram

//          Strings are imutable


//          The value of the 2 strings are :  equal

//          The string are false