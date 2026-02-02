package DSA_IMP_PROBLEMS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Product_Array_Except_Self_238 {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums){
        // Create a array to performing the prefix and postfix on same array
        int[] result = new int[nums.length];
        Arrays.fill(result,1);

        int pre = 1, post = 1;

        // Iterate for prefix to calculating and puting in result array
        for(int i = 0; i<nums.length; i++){
            result[i] = pre;
            pre = nums[i] * pre;
        }

        // Iterate for postfix to calculating and puting in result array
        // Iterate from back
        for(int i = nums.length-1; i>=0; i--){
            result[i] = result[i] * post;
            post = nums[i] * post;
        }

        return result;
    }
}
