package Top_50_Most_Asked_Questions.Array;

import java.util.HashSet;
import java.util.Set;

// Find Intersection of Two Arrays
// Time:  O(n + m) average
// Space: O(n)

public class Find_Intersection_of_Two_Arrays {
    public static Set<Integer> intersection(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();

        // Add all elements of first array
        for(int num : arr1){
            set.add(num);
        }

        Set<Integer> intersect = new HashSet<>();

        // Check second array
        for(int num : arr2){
            if(set.contains(num)){
                intersect.add(num);
            }
        }
        return intersect;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5, 1};

        System.out.println(intersection(arr1, arr2)); // [1, 2, 4]
    }
}
