import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        System.out.println("\n\t Check if the arr[] is sorted \n");
        int arr[] = {1, 2, 1, 3, 4};
        System.out.println("\n\t Array: " + Arrays.toString(arr));
        boolean isSorted = check(arr);
        if (isSorted) {
            System.out.println("\n\tThe array is sorted.");
        } else {
            System.out.println("\n\tThe array is not sorted.");
        }
    }

    private static boolean check(int a[]) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
                    output:

                    Check if the arr[] is sorted


         Array: [1, 2, 1, 3, 4]

        The array is not sorted.




        