package Top_50_Most_Asked_Questions.Array;

// Maximum Subarray Sum — Kadane's Algorithm
// Time:  O(n)
// Space: O(1)
public class Maximum_Subarray_Sum {
    public static int maxSubarraySum(int[] arr){
        // Start with the first element
        int currentSum = arr[0];
        int maxSum = arr[0];

        // Process remaining elements
        for(int i = 0; i<arr.length; i++){
            // Decide whether to:
            // 1. Start a new subarray
            // 2. Continue the existing subarray
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max subarray sum: " + maxSubarraySum(arr)); // 6
    }
}
