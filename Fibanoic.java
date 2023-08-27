import java.util.*;

public class Fibanoic {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("\n\t Enter a number : ");
        n = sc.nextInt();

        int f[] = new int[n];

        f[0]=0;
        f[1]=1;

        for(int i=2;i<n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        System.out.println("\n\t Fibonacci Series : ");
        for(int i=0;i<n;i++){
            System.out.println(f[i]+" ");
        }

    }
}
