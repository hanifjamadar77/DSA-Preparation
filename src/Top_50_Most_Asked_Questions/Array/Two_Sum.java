package Top_50_Most_Asked_Questions.Array;

import java.util.HashMap;

// Two Sum
// Time:  O(n) average
// Space: O(n)
public class Two_Sum {
    public static int[] twoSum(int[] arr, int target){
        // Store:
        // number -> its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            int current = arr[i];
            // Number needed to complete the target
            int complement = target - current;

            // Check whether required value
            // was already seen
            if(map.containsKey(complement)){
                return new int[]{map.get(complement) , i};
            }
            // Store current number and its index
            map.put(current, i);
        }
        // No pair found
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};

        int[] result = twoSum(arr, 22);

        System.out.println(result[0] + " " + result[1]); // 1 3
    }
}

// Array = [2, 7, 11, 15]
// Target = 9
//        2 + 7 = 9
// Answer = indices [0, 1]
