public class maxSubarray {
     public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];        // To store the final maximum sum
        int currentSum = nums[0];    // Running sum for current subarray

        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray at current element or continue previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}
