import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println("\n\t Selection sort \n");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter size of array \n");
        int s = sc.nextInt();
        System.out.println("\n\t Size of the array : " + s);
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\n\n\t Array is : arr[] = [");
        for (int elements : arr) {
            System.out.print(" " + elements + " ");
        }
        System.out.print(" ]");
        System.out.println("\n\n\t Before sorting : " + Arrays.toString(arr));
        ss(arr, s);
        System.out.println("\n\t After sorting : " + Arrays.toString(arr));
    }

    private static void ss(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}


                output :

                         Selection sort


         Enter size of array

6

         Size of the array : 6
1
46
24
52
20
9


         Array is : arr[] = [ 1  46  24  52  20  9  ]

         Before sorting : [1, 46, 24, 52, 20, 9]

         After sorting : [1, 9, 20, 24, 46, 52]





         
