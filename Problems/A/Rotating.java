import java.util.Scanner;

public class Rotating {
    public static void main(String[] args) {
        System.out.println("\n\t Rotating \n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            rotateArray(arr,n,k);

            for(int e:arr){
                System.out.print(e+" ");
            }
        }


    }
    private static void rotateArray(int[] arr,int n,int k){
            int temp[]=new int[n];
            for(int i=0;i<n;i++){
                temp[(i+k)%n]=arr[i];

            }
            System.arraycopy(temp, 0, arr,0,n);
    }
}
