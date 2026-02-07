package DSA_IMP_PROBLEMS;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Sliding_Window_Maximum_239 {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

        public static int[] maxSlidingWindow(int[] nums, int k) {
            if(nums == null || nums.length == 0 || k <= 0){
                return new int[0];
            }

            int n = nums.length;
            int[] result = new int[n-k+1];
            Deque<Integer> deque = new LinkedList<>();

            for(int i = 0; i<n; i++){
                while(!deque.isEmpty() && deque.peek() < i-k+1){
                    deque.poll();
                }

                // Removes the Index whose values are less then nums[i]
                while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                    deque.pollLast();
                }

                // Add current index to deque
                deque.offer(i);
                // Add the maximum element of the current window
                if(i >= k-1){
                    result[i-k+1] = nums[deque.peek()];
                }
            }
            return result;
        }
    }
