import java.util.*;

public class S {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 1, 8, 4, 7 };
        System.out.println("\n\t Finding smallest value of the array \n");
        System.out.print("\t The array : \t[");
        for (int element : arr) {
            System.out.print("  " + element);
        }
        System.out.print("\t]");
        System.out.println("\n\n\t Size of the array is : " + arr.length + "\n\n");
        int small = Integer.MAX_VALUE; // Initialize with a large value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) { // Compare with the current smallest value
                small = arr[i]; // Update the smallest value
            }
        }
        System.out.println("\n\t smallest value of the array is : " + small);
    }
}

// output:

//  Finding smallest value of the array

//          The array :    [  2  5  6  1  8  4  7  ]

//          Size of the array is : 7



//          smallest value of the array is : 1


//