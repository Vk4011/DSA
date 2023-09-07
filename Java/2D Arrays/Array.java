import java.util.*;

public class Array{
    public static void main(String[] args) {
        System.out.println("\n\t 2D Array \n");
        System.out.println("\n\t Enter the values \n");
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[2][2];
        int n=arr.length,m=arr.length;//int n=3,m=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n\t"+Arrays.toString(arr));

        //Out put:
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] +" ");
            }
        }
        System.out.println("\n");
        
    }
}