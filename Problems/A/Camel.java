import java.util.Scanner;

public class Camel {
    public static void main(String[] args) {
        System.out.print("\n\t Camel case notation \n ");
        System.out.print("\n\t Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder res= new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if(Character.isUpperCase(str.charAt(i))){
                res.append("\t");
                res.append(Character.toLowerCase(str.charAt(i)));
            }else if(Character.isLowerCase(str.charAt(i))){
                res.append(Character.toUpperCase(str.charAt(i)));
            }
           
        }
         System.out.println("\n\t Resulting String : "+res.toString());
    }
}

        //  Camel case notation

        //  Enter the String : thisIsATest

        //  Resulting String : THIS        iS      a       tEST







        