import java.util.*;

public class Average {
    public static void main(String[] args) {
        System.out.println("\n\t Average...");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int num[] = new int[s];
        System.out.println("\n\t Enter size of the array : ");
        for (int i = 0; i < s; i++) {
            System.out.println("\n\t Enter array elements : ");

            num[i] = sc.nextInt();
        }
        System.out.println("\n\t Array is : " + Arrays.toString(num));
        double ans=0;
        for (int i = 0; i <num.length; i++) {
           ans = ans+num[i];

        }
        ans=ans/num.length;
            System.out.println("\n\t the average of array : " + ans);

    }
}

// output :
//          Average...
// 5

//          Enter size of the array :

//          Enter array elements :
// 1

//          Enter array elements :
// 2

//          Enter array elements :
// 3

//          Enter array elements :
// 4

//          Enter array elements :
// 5

//          Array is : [1, 2, 3, 4, 5]

//          the average of array : 3.0


//The end ....
