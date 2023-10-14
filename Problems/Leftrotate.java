import java.lang.reflect.Array;
import java.util.Arrays;

public class Leftrotate{
    public static void main(String[] args) {
        System.out.println("\n\t Left Rotate an array by one place \n");
        int arr[]={1,2,3,4,5};
        System.out.println("\n\t The given array is : "+Arrays.toString(arr));
        int temp=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println("\n\t Array is : "+Arrays.toString(arr));
    }
}



                output

                 Left Rotate an array by one place


         The given array is : [1, 2, 3, 4, 5]        

         Array is : [2, 3, 4, 5, 1]




         