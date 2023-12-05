import java.util.Arrays;
import java.util.Scanner;

public class Rotating {
    public static void main(String[] args) {
        System.out.println("\n\t Rotating \n");
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\t Enter Array size : ");
        int n=sc.nextInt();
        System.out.print("\n\t number of rotation : ");
        int k=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("\n\t Enter the array element : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           

            // for(int e:arr){
            //     System.out.print(e+" ");
            // }
        }

        System.out.println("\n\t Array is : "+Arrays.toString(arr));
        rotateArray(arr, n, k);
         System.out.println("\n\t Array is : "+Arrays.toString(arr));
   
    }
    private static void rotateArray(int[] arr,int n,int k){
            int temp[]=new int[n];
            for(int i=0;i<n;i++){
                temp[(i+k)%n]=arr[i];

            }
            System.arraycopy(temp, 0, arr, 0, n);
    }
}





//      Rotating 


//          Enter Array size : 5

//          number of rotation : 1

//          Enter the array element :
// 1
// 2
// 3
// 4
// 5

//          Array is : [1, 2, 3, 4, 5]

//          Array is : [5, 1, 2, 3, 4]








