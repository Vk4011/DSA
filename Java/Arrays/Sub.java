
import java.util.*;

public class Sub {

    public static void subArrays(int n[]) {
        int ts = 0;// Total sub arrays

        for (int i = 0; i < n.length; i++) {
         
            int start = i;
            for (int j = i; j < n.length; j++) {
                   System.out.print("\t [");
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(" " + n[k]);
                }
                ts++;
                System.out.print(" ]");
                System.out.println("\n");

            }
            System.out.println("\n");
            System.out.println("\n\t Total Sub array : " + ts + "\n\n\n");

        }

    }

    public static void main(String[] args) {
        System.out.println("\n\t Print Sub Arrays it is continous part of array\n");
        int[] arr = { 2, 4, 6, 8, 10 };
        System.out.println("\n\t The Array    : " + Arrays.toString(arr) + "\n");
        System.out.println("\n\t Array length : " + arr.length + "\n");
        System.out.println("\n\t Sub arrays \n\n");
        subArrays(arr);

    }

}

           output:

                 Print Sub Arrays it is continous part of array


         The Array    : [2, 4, 6, 8, 10]


         Array length : 5


         Sub arrays


         [ 2 ]

         [ 2 4 ]

         [ 2 4 6 ]

         [ 2 4 6 8 ]

         [ 2 4 6 8 10 ]




         Total Sub array : 5



         [ 4 ]

         [ 4 6 ]

         [ 4 6 8 ]

         [ 4 6 8 10 ]




         Total Sub array : 9



         [ 6 ]

         [ 6 8 ]

         [ 6 8 10 ]




         Total Sub array : 12



         [ 8 ]

         [ 8 10 ]




         Total Sub array : 14



         [ 10 ]




         Total Sub array : 15



       