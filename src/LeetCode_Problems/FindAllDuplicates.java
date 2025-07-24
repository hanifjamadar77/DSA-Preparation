package LeetCode_Problems;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);  // Output: [2, 3]
    }

    // Function to find all duplicate numbers in the array
    public static List<Integer> findDuplicates(int[] nums) {
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

        // Step 2: Collect numbers that are not at their correct index => duplicates
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }

    // Utility function to swap two elements
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
