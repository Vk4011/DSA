public class Main {
    public static void printArr(int arr[]) {
        System.out.print("\n\t Array is : [  ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        System.out.println("\n\t Divide and Conquer \n");
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        printArr(arr);
        mergesort(arr, 0, arr.length - 1);
        printArr(arr);
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si < ei) {
            int mid = si + (ei - si) / 2; // (si+ei)/2
            mergesort(arr, si, mid); // left part
            mergesort(arr, mid + 1, ei); // right part
            merge(arr, si, mid, ei); // Merge
        }
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si; // iterator for the left part
        int j = mid + 1; // iterator for the right part
        int k = 0; // iterator for temp arr[]

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy the remaining elements from the left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements from the right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp array to the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}





        //          Divide and Conquer


        //  Array is : [  6 3 9 5 2 8 ]

        //  Array is : [  2 3 5 6 8 9 ]




        