package Top_50_Most_Asked_Questions.Array;

// Find Duplicate Elements in an Array

// Time:  O(n) average
// Space: O(n)
import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Elements_in_Array {
    public static Set<Integer> findDuplicates(int[] arr){
        // Stores elements encountered for the first time
        Set<Integer> set = new HashSet<>();

        // Stores duplicate elements
        Set<Integer> duplicates = new HashSet<>();

        // If add() returns false,
        // the number already exists in the set.
        for(int num : arr){
            if(!set.add(num)){
                duplicates.add(num);
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        System.out.println(findDuplicates(arr)); // [1, 2]
    }
}
