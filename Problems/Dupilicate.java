import java.util.Arrays;

public class Dupilicate {
    public static void main(String[] args) {
        System.out.println("\n\t Dupilicate number in array \n");
        int arr[] = {2,3,1,1,4,5};
        System.out.println("\n\t Array is  : "+Arrays.toString(arr));
        dup(arr);

    }
    private static void dup(int arr[]){
        int i=0;
        int l=arr.length;
        for(int j=1;j<l;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("\n\t The array is : "+Arrays.toString(arr));    
    }
    
}

            Dupilicate number in array 


         Array is  : [2, 3, 1, 1, 4, 5]

         The array is : [2, 3, 1, 4, 5, 5]



         