import java.util.*;

public class Large{
    
    public static int  findLargeValue(int arr[]){
        int largest = Integer.MIN_VALUE;//-infinity
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];

            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        System.out.println("\n\t Finding the largest value of Array \n");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t Enter arrray size  :");
        int s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("\n\t Enter array elements :");
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("\n\t The array is : "+Arrays.toString(arr));

        System.out.println("\n\t The largest value of the array is : "+findLargeValue(arr));

    }
}



// output:
//              Finding the largest value of Array


//          Enter arrray size  :
// 6

//          Enter array elements :
// 5
// 3
// 2
// 7
// 8
// 1

//          The array is : [5, 3, 2, 7, 8, 1]

//          The largest value of the array is : 8



