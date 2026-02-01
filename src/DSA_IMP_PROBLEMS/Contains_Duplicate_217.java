package DSA_IMP_PROBLEMS;

import java.util.HashSet;

public class Contains_Duplicate_217 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        // Create the HashSet
        HashSet<Integer> seenNumber = new HashSet<>();

        // Iterate the array
        for(int num : nums){
            // Check the element is present in array or not
            if(seenNumber.contains(num)){
                return true ;// Deplicate is found
            }
            // Adds the elements in array
            seenNumber.add(num);
        }
        // Duplicate not found
        return false;
    }
}
