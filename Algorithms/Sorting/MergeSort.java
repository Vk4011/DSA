
Merge sort starts by dividing the array recursively into smaller subarrays until each subarray has one element (which is inherently sorted).
 Then, it merges these subarrays back together in sorted order.

import java.util.Arrays;

public class MergeSort{

public static void merge(int a[], int start, int mid, int end, int[] t) {
    int i = start;
    int j = mid + 1;
    int k = start; // Index for temp array

    // Copy elements to temp array in sorted order
    while (i <= mid && j <= end) {
        if (a[i] <= a[j]) {
            t[k] = a[i];
            i++;
        } else {
            t[k] = a[j];
            j++;
        }
        k++;
    }

    // Copy remaining elements from left subarray, if any
    while (i <= mid) {
        t[k] = a[i];
        i++;
        k++;
    }

    // Copy remaining elements from right subarray, if any
    while (j <= end) {
        t[k] = a[j];
        j++;
        k++;
    }

    // Copy sorted elements from temp back to original array
    for (int p = start; p <= end; p++) {
        a[p] = t[p];
    }
}

public static void main(String ags[]){
    System.out.print("\n\t Merge Sort \n");
    int a[]={5,1,4,3,2};
    System.out.printf("\n\t Array : %d",Arrays.toString(a));
    sort(a);
    System.out.printf("\n\t Sorted array : %d",Arrays.toString(a));
}
public static void sort(int a[]){
    if(a==null||a.length<1){
        return;
    }
    int arr[] = new int[a.length];
    int start=0;
    int end=a.length-1;
    mergesort(a,start,end,arr);
}


public static void mergesort(int arr[],int s,int e,int temp[]){
    if(s>=e){
        return;
    }
    int mid=s+(s-e)/2;
    mergesort(arr,s,mid,temp);
    mergesort(arr,mid+1,e,temp);
    merge(arr,s,mid,e,temp);
}
}


                                Array [5, 1, 4, 3, 2]


Initial Array: [5, 1, 4, 3, 2]

Indices:        0, 1, 2, 3, 4

Length: n = 5


Step 1: First Division   Call mergeSort(a, left=0, right=4)

Array: [5, 1, 4, 3, 2]
Calculate middle: mid = left + (right - left) / 2 = 0 + (4 - 0) / 2 = 2


(n-1)/2 = 4/2 = 2

0 1    2     3  4 

plit into two subarrays:
Left half: [5, 1, 4] (indices 0 to 2)

Right half: [3, 2] (indices 3 to 4)


Step 2: Divide Left Half [5, 1, 4] = n-1/2 = 2/2 = 1   and Step 3: Divide Left Half [5, 1]   Call mergeSort(a, left=0, right=1):
         
                Subarray: [5, 1, 4]                                     Subarray: [5, 1]
              Calculate middle: mid = 0 + (2 - 0) / 2 = 1               Calculate middle: mid = 0 + (1 - 0) / 2 = 0.5 = 0  
                     Split into:                                                    Split into:
                   Left half: [5, 1] (indices 0 to 1)                      Left half: [5] (index 0)
                   Right half: [4] (index 2)                            Right half: [1] (index 1)


                                        Call mergeSort(a, left=0, right=2):




// 5





~