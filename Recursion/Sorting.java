// 
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        System.out.println("\n\t Check if a given array is sorted or not \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\t Enter array size : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("\n\t Array is : [ ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.print("]\n");

        boolean sorted = isSorted(0, arr);
        if (sorted) {
            System.out.println("\n\t The array is sorted.");
        } else {
            System.out.println("\n\t The array is not sorted.");
        }
    }

    public static boolean isSorted(int i, int arr[]) {
        int l = arr.length;
        if (i == l - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(i + 1, arr);
    }
}


//                 output:


                
//          Enter array size :
// 3
// 2
// 1
// 4

//          Array is : [ 2 1 4 ]

//          The array is not sorted.




