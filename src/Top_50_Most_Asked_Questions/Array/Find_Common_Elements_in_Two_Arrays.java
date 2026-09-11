package Top_50_Most_Asked_Questions.Array;

import java.util.HashSet;
import java.util.Set;

// Find Common Elements in Two Arrays
// Time:  O(n + m) average
// Space: O(n)
public class Find_Common_Elements_in_Two_Arrays {
    public static Set<Integer> findCommonElements(int[] arr1, int[] arr2){
        // Store first array elements
        Set<Integer> set = new HashSet<>();

        for(int num : arr1){
            set.add(num);
        }
        // Store common elements
        Set<Integer> common = new HashSet<>();
        for(int num : arr2){
            // Check elements of second array
            if(set.contains(num)){
                common.add(num);
            }
        }
        return common;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2, 7, 2, 4, 9};
        int[] arr2 = {2, 4, 6, 4, 8, 9};
        Set<Integer> result = findCommonElements(arr1, arr2);
        System.out.println("Common: " + result);
    }
}
