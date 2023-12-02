
   public class Subarray {
        public static void main(String[] args) {
            int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int[] nums2 = {3, -1, 2, 5, -6, 3};
    
            System.out.println("\n\t Maximum sum of contiguous subarray 1: " + maxSubArray(nums1));
            System.out.println("\n\t Maximum sum of contiguous subarray 2: " + maxSubArray(nums2));
        }
    
        public static int maxSubArray(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
    
            int maxSum = nums[0];
            int currentSum = nums[0];
    
            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSum = Math.max(maxSum, currentSum);
            }
    
            return maxSum;
        }
    }
        

        //  Maximum sum of contiguous subarray 1: 6

        //  Maximum sum of contiguous subarray 2: 9




        