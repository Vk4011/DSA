import java.util.*;

public class Push {
    public static void main(String ag[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t Enter the size of arr  :  ");
        int n = sc.nextInt();
        System.out.print("\n\t Enter the Elements of Array \n");

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("\n\t Enter element of a[%d] : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.println("\n\t Array arr[] : " + Arrays.toString(arr));
        newArray(arr);
        System.out.println("\n\t Array arr[] : " + Arrays.toString(arr));
    }

    public static void newArray(int a[]) {
        int temp[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }

        System.out.print("\n\t Array temp[] : [ ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.print("]\n");
    }
}
