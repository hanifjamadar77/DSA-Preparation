package Top_50_Most_Asked_Questions.Array;

import java.util.HashSet;
import java.util.Set;

// Find Pair with Given Sum
// Time:  O(n) average
// Space: O(n)
public class Find_Pair_with_Given_Sum {
    public static int[] findPair(int[] arr, int target){
        // Stores previously seen elements
        Set<Integer> set = new HashSet<>();

        for(int num : arr){
            // Value needed to reach target
            int complement = target - num;
            // If required value was already seen,
            // we have found a valid pair.
            if(set.contains(complement)){
                return new int[] {complement, num};
            }
            // Store current element
            set.add(num);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 7};
        int target = 8;
        int[] pair = findPair(arr, target);
        if (pair != null) {
            System.out.println("Pair: " + pair[0] + " + " + pair[1] + " = " + target);
        } else {
            System.out.println("No pair found");
        }
    }
}
