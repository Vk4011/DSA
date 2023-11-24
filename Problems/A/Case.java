import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        System.out.println("\n\t l - U and U - l \n");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Enter the string : ");
        String s=sc.nextLine();
        String output="";
        for(char ch : s.toCharArray()){
            if(Character.isUpperCase(ch)){
                output+="\n";
                ch=Character.toLowerCase(ch);
            }
            else{
                ch=Character.toUpperCase(ch);
            }
            output=output+ch;

        }
        System.out.println("\n\t Out put : "+output);
    }
    
}



//         l - U and U - l


//          Enter the string :
// saveChangesInTheEditor

//          Out put : SAVE
// cHANGES
// iN
// tHE
// eDITOR





