package LeetCode_Problems.Binary_Search;

public class Min_Rotated_array_153 {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1,0};
        int ans = findMin(arr);
        System.out.println(ans);
    }

   static public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(nums[start] < nums[end]){
                return nums[start];
            }

            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return nums[end];
    }
}
