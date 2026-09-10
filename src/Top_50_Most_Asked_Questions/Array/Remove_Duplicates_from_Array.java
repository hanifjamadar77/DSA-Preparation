package Top_50_Most_Asked_Questions.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Duplicates_from_Array {

     // Remove Duplicates from an Array when array is sorted
    // Using Two Pointer approach
//    Time:  O(n)
//    Space: O(1)

//    public static int removeDuplicates(int[] arr){
//        if(arr.length == 0){
//            return 0;
//        }
//
//        int i = 0;
//        for(int j = 1; j < arr.length - 1; j++){
//            if(arr[i] != arr[j]){
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        return i+1;
//    }

    // Remove Duplicates from an Array when array is not sorted
    // Using HastSet
//    Time:  O(n) average
//    Space: O(n)

    public static int[] removeDuplicates(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] result = new int[set.size()];

        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 2, 2, 5, 4, 4};

        int[] result = removeDuplicates(arr);

        // Print only the unique portion
//        System.out.println(Arrays.toString(Arrays.copyOf(arr, n)));

        System.out.println(Arrays.toString(result));
    }
}
