import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Enter a value :");
        int x=sc.nextInt();
         System.out.println("\n\t Enter a value :");
        int y=sc.nextInt();
        int ans = mul(x,y);
        System.out.println("\n\t The product is : "+ans+"\n");
    }
    static int mul(int a,int b){
        int mul = a*b;
        return mul;
    }
}

output:
         Enter a value :
3

         Enter a value :
4

         The product is : 12