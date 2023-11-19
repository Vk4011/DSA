


import java.util.*;
public class Maxsubstrings
{
	static int maxProductSubArray(int arr[]) {
	    int result = arr[0];
	    for(int i=0;i<arr.length-1;i++) {
	        int p = arr[i];
	        for(int j=i+1;j<arr.length;j++) {
	            result = Math.max(result,p);
	            p *= arr[j];
	        }
	        result = Math.max(result,p);
	    }
	   return result;     
	}
	public static void main(String[] args) {
        System.out.println("\n\t Product of max sub arrays \n");
		int nums[] = {1,2,-3,0,-4,-5};
        System.out.println("\n\t array : "+Arrays.toString(nums));
		int answer = maxProductSubArray(nums);
		System.out.print("\n\tThe maximum product subarray is: "+answer);
	}
}

//  Product of max sub arrays 


//          array : [1, 2, -3, 0, -4, -5]

//         The maximum product subarray is: 20



