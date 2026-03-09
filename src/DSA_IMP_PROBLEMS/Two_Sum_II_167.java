package DSA_IMP_PROBLEMS;

import java.util.Arrays;

public class Two_Sum_II_167 {
    public static void main(String[] args) {
        int[] arr = {2,3,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        // Solution using Two Pointers approach
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            // Checking if the sum of left and right is greater then target then reduce the right by 1
            if(numbers[left] + numbers[right] > target){
                right = right - 1;
            }
            // Checking if the sum of left and right is smaller then target then increase the left by 1
            else if(numbers[left] + numbers[right] < target){
                left = left + 1;
            }
            // if sum is equal to target then return the index of left and right by +1 beacause in question the index is start from 1
            else{
                return new int[] {left + 1, right + 1};
            }
        }
        //  Due to return type return null if conditions not statisfied
        return null;
    }
}
