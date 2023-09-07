import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Matrix ");
        int Matrix[][] = new int[3][3];
        int n=Matrix.length,m=Matrix[0].length;
        System.out.println("\n\t Enter the values : \n");
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                Matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("\n\t Output :");
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print( Matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");


    }
}
