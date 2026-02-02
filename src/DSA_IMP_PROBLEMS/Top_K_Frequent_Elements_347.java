package DSA_IMP_PROBLEMS;

import java.util.*;

//https://leetcode.com/problems/top-k-frequent-elements/description/

public class Top_K_Frequent_Elements_347 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        System.out.println(Arrays.toString(topKFrequent(nums,2)));
    }

    public static int[] topKFrequent(int[] nums, int k){
        // Create a Hash Map which stores the values and their occurance
        Map<Integer, Integer> count = new HashMap<>();

        // Stores the values and their occurance in HashMap
        for(int n : nums){
            count.put(n, count.getOrDefault(n,0) + 1 );
        }

        // Create a priority Queue
        Queue<Integer> heap = new PriorityQueue<>(
                (a,b) -> count.get(a) - count.get(b) );

        // Store the elements in Queue
        for(int n : count.keySet()){
            heap.add(n);
            // If it exceed the size of head then remove it
            if(heap.size() > k){
                heap.poll();
            }
        }
        // Crete a array to store the ans which takes the heap poll
        int[] ans = new int[k];
        for(int i =0 ; i<k ; i++){
            ans[i] = heap.poll();
        }

        return ans;
    }
}
