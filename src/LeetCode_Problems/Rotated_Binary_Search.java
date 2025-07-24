package LeetCode_Problems;

public class Rotated_Binary_Search {
    public static void main(String[] args) {

    }

    static int search(int[] nums, int target) {
        int pivot  = findPivot(nums);
//        If you did not find the pivot element that is the array is not rotating
        if(pivot == -1){
//            Just do the simple Binary Search
            return binarySearch(nums, target, 0 , nums.length -1);
        }
//        If the pivot is found then you found the two asc sorted array
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0 , pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length -1);
    }


    static int binarySearch(int[] arr, int target, int start, int end){
//        Find the Mid element
        while (start <= end){
            int mid = start + (end-start) /2;

            // Checks Every conditions
            if(target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }else {
                return  mid;
            }

        }
        return -1;
    }

//    This will not work for duplicate values
     static  int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start) /2;

//      4 cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }if(mid > start && arr[mid] < arr[mid - 1] ){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
     }

//     This Function will find the pivot with duplicate values
    static  int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start) /2;

//      4 cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }if(mid > start && arr[mid] < arr[mid - 1] ){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid -1;
            }
//            If element at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
//                Skip the Duplicates
//                Note : what if these elements at start and end were the pivot ??
//                check if start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }start ++;
//                chaeck whether end is pivot
                if(arr[end] < arr[end-1]){
                    return end -1;
                }
                end--;
            }
//            left side is sorted , so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid +1;

            }else {
                end = mid -1;
            }
        }
        return -1;
    }

}
