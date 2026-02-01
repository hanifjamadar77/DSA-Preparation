package DSA_IMP_PROBLEMS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_01 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] result = twoSum(arr,6);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target){
//        Create a Hash Map
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
//         Calculate the Compliment
            int complement = target - nums[i];

//         Check the complement in the Hash Map
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

}
