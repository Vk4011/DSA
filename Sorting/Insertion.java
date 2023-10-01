import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        System.out.println("\n\t Insertion sort \n");
        // int n=7;
        int arr[] = {14,9,15,12,6,8,13};
        System.out.println("\n\t Array is : "+Arrays.toString(arr));
        insertion_sort(arr);
        System.out.println("\n\t sorted array : " + Arrays.toString(arr));
    }

    private static void insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }
}


                    output:

                        Insertion sort


         Array is : [14, 9, 15, 12, 6, 8, 13]

         sorted array : [6, 8, 9, 12, 13, 14, 15]




         