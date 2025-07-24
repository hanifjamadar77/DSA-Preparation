package LeetCode_Problems;

public class FirstAndLastElement {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

//    This function is just return the index value of target
        int search ( int[] nums, int target, boolean firstElement){
//           My Potential answer
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;

//        Find the Mid element
            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Checks Every conditions
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
//                   Potential ans found
                    ans = mid;
                    if(firstElement){
                        end = mid - 1;
                    }else{
                        start = mid + 1;
                    }
                }

            }
            return ans;
        }
    }
