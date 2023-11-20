import java.util.Scanner;

public class ReverseArray {
    public static void pae(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\t Array: [ ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.print("]\n");
    }

    public static void rev(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        for(int s=0;s<end;s++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\t Reverse Array \n");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t Enter array size n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        pae(arr); // Call to input array elements and display them
        rev(arr); // Call to reverse the array

        System.out.print("\n\t Reversed Array: [ ");
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.print("]\n");

        sc.close(); // Close the Scanner object
    }
}

//         Reverse Array


//          Enter array size n: 5

//          Enter Array elements: 1
// 1 2
// 2 3
// 3 4
// 4 5
// 5
//          Array: [ 1 2 3 4 5 ]

//          Reversed Array: [ 5 4 3 2 1 ]










