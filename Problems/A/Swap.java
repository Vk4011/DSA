import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println("\n\t Swap the Character \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t Enter the String : ");
        String str=sc.nextLine();
        System.out.println("\n\t Swap case : "+swapCase(str));
    }
    public static String swapCase(String s) {
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            char c=a[i];
            if(Character.isUpperCase(c)){
                a[i]=Character.toLowerCase(c);
            }else if(Character.isLowerCase(c)){
                a[i]=Character.toUpperCase(c);
            }

        }
        return new String(a);
        
    }
    
}


        //  Swap the Character 


        //  Enter the String : he2llO WorLd

        //  Swap case : HE2LLo wORlD








        