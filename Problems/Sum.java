import java.util.*;

class Sum {
    public static void main(String args[]) {
        // int nums[] = new int[3];
        // nums[0]=5;
        // nums[1]=2;
        // nums[2]=4;
        System.out.println("\n\t Sum of two integer is equal to target \n");
        int nums[] = {11,7,2,15};
        System.out.println("\n\t The elements in array :"+Arrays.toString(nums));
        int target=9;
        System.out.println("\n\t Target Value : "+target);
        for(int i=0;i<=nums.length;i++){
           
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]== target){
                    // System.out.println("\n\t The sum of two integer is equal to target ..\n");
                    System.out.println("\n\t Sum of integer  "+nums[i]+"+"+nums[j]+"="+target);

                }

            }
            //  System.out.println("\n\t Element at index "+i+"\t : "+nums[i]);
                   
        }
        
         System.out.println("\n\t Hence proved \n");
        
    }

}



/*

{5,2,4}

6


*/