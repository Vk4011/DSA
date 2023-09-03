    
import java.util.Scanner;

public class ReverseArray  {

    public static void revs(int num[]) {
        int first = 0, last = (num.length) - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Reverse array \n");
        System.out.println("\n\t Enter size of array : ");
        int s = sc.nextInt();
        System.out.println("The array size : " + s);
        int arr[] = new int[s];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\n\n\tThe Elements in array \n");
        System.out.print("\tarr[]  =  [");

        for (int element : arr) {
            System.out.print("\t" + element);
        }
        System.out.print("\t]\n\n");

        revs(arr); // Call the revs function to reverse the array

        System.out.println("\n\tThe Reversed array \n");
        System.out.print("\tarr[]  =  [");

        for (int element : arr) {
            System.out.print("\t" + element);
        }
        System.out.print("\t]\n\n");
    }
}


// output:
//     Reverse array


//          Enter size of array :
// 5
// The array size : 5
// 2
// 1
// 4
// 3
// 2


//         The Elements in array

//         arr[]  =  [     2       1       4       3       2       ]


//         The Reversed array

//         arr[]  =  [     2       3       4       1       2       ]





//         //The Reverse array