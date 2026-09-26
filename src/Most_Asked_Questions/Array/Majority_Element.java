package Most_Asked_Questions.Array;

import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(mejorityEle(nums));
    }

    private static int mejorityEle(int[] nums) {
//By Using Boyer-Moore Voting
        // Time O(n);
        // Space O(n)
        int freq = 0; int ans = 0;
        for(int i = 0; i< nums.length; i++){
            if(freq == 0){
                ans = nums[i];
                freq = 1;
            } else if (nums[i] == ans) {
                freq ++;
            }
            else {
                freq --;
            }
        }
        return ans;



        // By Using HashMap
        // Time O(n);
        // Space O(n)
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int n = nums.length;
//        for(int num : nums){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//
//            if(map.get(num) > n/2){
//                return num;
//            }
//        }
//        return -1;


// Using two for loop
        //Time : O(n ^ 2)
        // Space : O(1)
//        int n = nums.length;
//        for(int val : nums){
//            int freq = 0;
//            for(int el : nums){
//                if(el == val){
//                    freq ++;
//                }
//            }
//            if(freq > n/2){
//                return val;
//            }
//        }
//        return -1;
    }
}
