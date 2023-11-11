import java.lang.reflect.Array;
import java.util.Arrays;

public class RotatedSorted {
    public static int search(int arr[], int tar, int si, int ei) {


        // Base case
        if(si>ei){
            return -1;
        }

        //
        int mid = si + (ei - si) / 2;// (si+ei)/2

        // case Found
        if (arr[mid] == tar) {
            return mid;

        }
        // mid on l1
        if (arr[si] <= arr[mid]) {
            // case a:left
            if (arr[si] <= tar && tar <= arr[ei]) {
                return search(arr, tar, si, mid);
            } else {
                // case b: right
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            // case c: riht
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // case d: left
                return search(arr, tar, si, mid + 1);

            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\t Search in Roatated Sorted Array \n");
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6; // output -> 4
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.print("\n\t Target Index : " + tarIdx);
        System.out.println("\n\t Arrray : "+Arrays.toString(arr));
    }

}

        // Search in Roatated Sorted Array   target = 0;


        //  Target Index : 4
