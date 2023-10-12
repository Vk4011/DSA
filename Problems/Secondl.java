import java.util.Arrays;

public class Secondl {
    public static void main(String[] args) {
        System.out.println("\n\t Find the second largest element in the array \n");
        int arr[] = {1, 2, 1, 3, 4};
        System.out.println("\n\t Array: " + Arrays.toString(arr));
        
        int secondLargest = findSecondLargest(arr);
        
        if (secondLargest != Integer.MIN_VALUE) {
            System.out.println("\n\tThe second largest element in the array is: " + secondLargest);
        } else {
            System.out.println("\n\t There is no second largest element in the array.");
        }
    }

    private static int findSecondLargest(int a[]) {
        if (a.length < 2) {
            return Integer.MIN_VALUE; // Handle the case when there are less than two elements.
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > firstMax) {
                secondMax = firstMax;
                firstMax = a[i];
            } else if (a[i] > secondMax && a[i] != firstMax) {
                secondMax = a[i];
            }
        }

        return secondMax;
    }
}
//                 output:

//                   Find the second largest element in the array


        //  Array: [1, 2, 1, 3, 4]

        // The second largest element in the array is: 3





        
