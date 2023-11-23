import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("\n\t String Reverse \n");
        Scanner scanner=new Scanner(System.in);
        System.out.print("\n\t Enter a String input : ");
        String str=scanner.nextLine();
        String rev=reverse(str);
        System.out.println("\n\t Reversed Stgring : "+rev);
        scanner.close();


    }
    public static String reverse(String str) {

        char a[]=str.toCharArray();
        int left=0;
        int right=a.length-1;
        while(left<right){
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;

        }
        return new String(a);

        
    }
    
}

        //   String Reverse 


        //  Enter a String input : MARKIV

        //  Reversed Stgring : VIKRAM




        