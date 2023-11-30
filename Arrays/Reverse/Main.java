import java.util.*;
public class Main{
    static{
        System.out.print("\n\t Enter the String : ");
    }
    static public void main(String ...a){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char a1[]=str.toCharArray();
        char a2[]=new char[a1.length];
        int j=a1.length-1;

        for(int i=0;i<a1.length;i++){
            a2[j--]=a1[i];
        }
        System.out.print("\n\t The reverse string : [ ");
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]+" ");
        }
        System.out.print("]\n");

        Main m=new Main();
        m.caseConvert();
    }
    void caseConvert(){
        String str1="Vikram";
        String str2="RAM";
        System.out.println("\n\t String 1 : "+str1);
        System.out.println("\n\t String 2 : "+str2);
        String lowerCase1=str1.toUpperCase();
        String lowerCase2=str2.toLowerCase();

        String str = lowerCase1+lowerCase2;
        System.out.println("\n\t String : "+str);
    }
}


        //  Enter the String : vikram

        //  The reverse string : [ m a r k i v ]






// String 1 : Vikram

//          String 2 : RAM

//          String : VIKRAMram





