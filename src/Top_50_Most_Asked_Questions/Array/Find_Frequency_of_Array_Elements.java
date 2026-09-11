package Top_50_Most_Asked_Questions.Array;

import java.util.HashMap;
import java.util.Map;

// Find Frequency of Array Elements
// Time:  O(n) average
// Space: O(k)

public class Find_Frequency_of_Array_Elements {
    public static Map<Integer, Integer> findFrequency(int[] arr){
        // Map stores:
        // element -> frequency
       HashMap<Integer, Integer> map = new HashMap<>();

        // Count every element
       for(int num : arr){
           map.put(num, map.getOrDefault(num, 0) + 1);
       }
       return map;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9, 4};
        Map<Integer, Integer> result = findFrequency(arr);
        System.out.println("Frequencies: " + result); // Frequencies: {2=2, 4=3, 7=1, 9=1}
    }
}
