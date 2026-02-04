package DSA_IMP_PROBLEMS;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consesutive_Sequence_128 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int longestSub = 1;
        for(int num : set){
            if(set.contains(num-1)) {
                continue;
            }
            else{
                int  currentNum = num;
                int currentSub = 1;
                while(set.contains(currentNum+ 1)){
                    currentNum ++;
                    currentSub ++;
                }
                longestSub =  Math.max(longestSub, currentSub);
            }
        }
        return longestSub;
    }

//    public static int longestConsecutive(int[] nums){
//        if(nums == null || nums.length == 0) return 0;
//        Arrays.sort(nums);
//
//        int longest = 1;
//        int current = 1;
//        for(int i = 1; i < nums.length; i++){
//           if(nums[i] == nums[i-1]){
//               continue;
//           }
//           if(nums[i] == nums[i-1]+1){
//               current++;
//           }
//           else{
//               current = 1;
//           }
//           longest = Math.max(longest, current);
//        }
//        return longest;
//    }
}
