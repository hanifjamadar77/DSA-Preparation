package LeetCode_Problems.Cyclic_Sort;

public class SetMissmatch {
    public static void main(String[] args) {

    }

    // Function to find all duplicate numbers in the array
    public int[] findErrorNums(int[] nums) {
        int i = 0;

        // Step 1: Cyclic sort to place each number at its correct index
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Only swap if the number is not in the correct position
            // AND it's not a duplicate (i.e., not already at its position)
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Step 2: Collect numbers that are not at their correct index => duplicate
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[] {-1, -1};
    }

    // Utility function to swap two elements
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
