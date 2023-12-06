
import java.util.*;

public class Second {
    public static void main(String[] args) {
        System.out.println("\n\t Second largest element in array \n");
        System.out.print("\n\t Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("\n\t Enter the array elements : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("\n\t Array is : " + Arrays.toString(a));
        e(a, n);
    }

    public static void e(int a[], int n) {
        Arrays.sort(a);
        System.out.println("\n\t Sorted Array : " + Arrays.toString(a));
        if (n >= 2) {
            System.out.println("\n\t Second largest : " + a[n - 2]);
        } else {
            System.out.println("\n\t Array size is less than 2 elements.");
        }
    }
}


//     Enter size of array : 5

//          Enter the array elements : 
// 6
// 8
// 3
// 2
// 7

//          Array is : [6, 8, 3, 2, 7]

//          Sorted Array : [2, 3, 6, 7, 8]

//          Second largest : 7



