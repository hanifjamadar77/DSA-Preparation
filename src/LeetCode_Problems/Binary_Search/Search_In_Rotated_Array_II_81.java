package LeetCode_Problems.Binary_Search;

public class Search_In_Rotated_Array_II_81 {
    public static void main(String[] args) {
        int[] arr = {2,5,6,0,0,1,2};
        boolean ans = search(arr, 8);
        System.out.println(ans);
    }

      static   public boolean search(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1 ;

            while(start <= end){
                int mid = start + (end - start) / 2;

                if(target == nums[mid]){
                    return true;
                }

                // If duplicates are at start, mid, and end -> shrink search space
                if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                    start++;
                    end--;
                    continue;
                }

// If left part is sorted
                if(nums[start] <= nums[mid]){
                    if(nums[start] <= target && target < nums[mid]){
                        end = mid - 1;
                    }
                    else{
                        start = mid + 1;
                    }
                }
                // If right part is sorted
                else{
                    if(nums[mid] < target &&  target <= nums[end]){
                        start = mid + 1;
                    }
                    else{
                        end = mid - 1;
                    }
                }
            }
            return false;
        }
    }

