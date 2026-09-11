package Top_50_Most_Asked_Questions.Array;

// Find Union of Two Arrays
// Time:  O(n + m) average
// Space: O(n + m)
import java.util.LinkedHashSet;
import java.util.Set;

public class Find_Union_of_Two_Arrays {
    public static Set<Integer> union(int[] arr1, int[] arr2){
        // LinkedHashSet:
        // Removes duplicates
        // Preserves insertion order
        Set<Integer> set = new LinkedHashSet<>();

        // Add first array
        for(int num : arr1){
            set.add(num);
        }
        // Add second array
        for(int num : arr2){
            set.add(num);
        }
        return set;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5};

        System.out.println(union(arr1, arr2)); // [1, 2, 3, 4, 5]
    }
}
