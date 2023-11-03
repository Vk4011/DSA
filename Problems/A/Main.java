import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter the string : ");
        String s=sc.nextLine();
        System.out.println("\n\t swapcase : "+swapCase(s));



    }
    public static String swapCase(String str) {
        char ca[] = str.toCharArray();
        for(int i=0;i<ca.length;i++){
            char c = ca[i];
            if(Character.isUpperCase(c)){
                ca[i] = Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                ca[i]=Character.toUpperCase(c);
            }
        }
        return new String(ca);
        
    }
}


                
//          Enter the string : 
// Hello WorlD

//          swapcase : hELLO wORLd


//          Enter the string :
// Hel2lo WorLD

//          swapcase : hEL2LO wORld





