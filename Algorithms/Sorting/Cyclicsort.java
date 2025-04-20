
import java.util.*;

public class Cyclicsort{
    public static void main(String args[]){
        System.out.println("\n\t Cyclic Sort \n");
        int arr[] = {3,2,1,5,4};
        System.out.print("\n\t Array : "+Arrays.toString(arr));
        logValues(arr);
        for(int i=0;i<arr.length-1;i++){
            
            while(i<arr.length){
                int v=arr[i]-1;
                if(arr[i]!=arr[v]){
                    int temp = arr[i];
                    arr[i] = arr[v];
                    arr[v]=temp;
                }else{
                    i++;
                }
            }
        }
        System.out.print("\n\n\t Sorted  Array : "+Arrays.toString(arr));
        logValues(arr);
    }
    public static void logValues(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.printf("\n\t value  at a[ %d ] = ",i);
            System.out.print(arr[i]);
        }
    }
}