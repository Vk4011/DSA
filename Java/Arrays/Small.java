import java.util.*;
public class Small {
    public static void main(String[] args) {
        int[] arr={2,5,6,1,8,4,7};
        System.out.println("\n\t Finding smallest value of the array \n");
        System.out.print("\t The array : \t[");
        for(int element:arr){
        System.out.print("  "+element);
        }
        System.out.print("\t]");
        System.out.println("\n\n\t Size of the array is : "+arr.length+"\n\n");
        int small = Integer.MAX_VALUE;//infinity;
        for(int i=0;i<arr.length;i++){
            if(small < arr[i]){
                small=arr[i];
            }
        }
        System.out.println(small);
        System.out.println("\n\t smallest value of the array is : "+small);
        


    }
    
}


// output:

    
//          Finding smallest value of the array

//          The array :    [  2  5  6  1  8  4  7  ]

//          Size of the array is : 7


// 2147483647

//          smallest value of the array is : 2147483647



//