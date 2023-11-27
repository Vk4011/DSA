import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("\n\t Reverse String \n");
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\t Enter the String : ");
        String s=sc.nextLine();
        StringBuilder n = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            n.append(s.charAt(i));

        }
        System.out.println("\n\t The reverse string : "+n);
        
        rev(s);

    }
    public static void rev(String s) {

        String w[]=s.split("\\s+");
        StringBuilder r=new StringBuilder();

        for(int i=w.length-1;i>=0;i--){
                r.append(w[i]).append(" ");
        }
        System.out.println("\n\t Reversed String : "+r.toString().trim());
        
    }

}


        //       Reverse String


        //  Enter the String : Hello world

        //  The reverse string : dlrow olleH 

        //  Reversed String : world Hello 


        //  Reverse String


        //  Enter the String : Vikram Ram

        //  The reverse string : maR markiV  

        //  Reversed String : Ram Vikram 


        