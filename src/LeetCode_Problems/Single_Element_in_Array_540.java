package LeetCode_Problems;

public class Single_Element_in_Array_540 {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,11,11,12};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }



//First Solution using Interative
//   static int singleNonDuplicate(int[] nums) {
//        int firstIndex = 0;
//        int secondIndex = 1;
//       while (secondIndex < nums.length){
//            if (nums[firstIndex] != nums[secondIndex]){
//                return nums[firstIndex];
//            }
//            firstIndex +=2;
//            secondIndex+=2;
//        }
//        return nums[nums.length - 1];
//    }


//    second solution Optimal solution O(Log n) complixity
    static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length -1 ;

        while (start < end){
            int mid = start + (end - start) / 2;

            if(mid % 2 == 1){
                mid --;
            }

            if(nums[mid] == nums[mid + 1]){
                start = mid + 2;
            }
            else {
                end = mid;
            }
        }
        return nums[start];
    }
}
