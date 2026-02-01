// https://leetcode.com/problems/contains-duplicate-ii/description/

package DSA_IMP_PROBLEMS;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate_II_219 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr, 3));
    }

    public static boolean containsDuplicate(int[] nums, int k) {
        // Create the Hash set
        Set<Integer> set = new HashSet<>();

        // Iterate the array
        for(int i =0; i<nums.length; i++){
            // Check the element is present in set
            if(set.contains(nums[i])){
                return true;
            }
            // If not add the elements in Hashset
            set.add(nums[i]);

            // Implement the sliding window
            if(set.size() > k){
                // Remove the first index to add the new index
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
