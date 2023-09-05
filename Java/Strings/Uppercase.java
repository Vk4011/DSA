import java.util.*;

public class Uppercase {
    public static void main(String[] args) {
        System.out.println("\n\t For a given String convert each the first letter of each word to uppercase \n");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Enter a sentence :");
        String str=sc.nextLine();
        System.out.println("\n\t "+toUpperCase(str));

    
    
    }

    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder();//character.toUppercase(ch);
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                    sb.append(str.charAt(i));
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();


    }
    
}

//             output:

            
//          Enter a sentence :
// hi , i am programmer

//          Hi , I Am Programmer