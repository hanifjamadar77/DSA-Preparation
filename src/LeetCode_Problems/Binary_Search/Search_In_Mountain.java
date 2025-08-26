package LeetCode_Problems.Binary_Search;

public class Search_In_Mountain {
    public static void main(String[] args) {

    }
    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OABS(arr, target, 0 , peak);
        if(firstTry != -1){
            return firstTry;
        }else{
            return OABS(arr, target, peak+1, arr.length-1);
        }
    }

        public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length -1;
            while(start < end){
                int mid = start + (end - start) /2;

                if(arr[mid] > arr[mid+1]){
//                Now we are in the des part of the array
//                This may be a ans but look at left
//                This is why end != mid-1
                    end = mid;
                }else {
//                Now we are in des part of the array
                    start = mid + 1; // Here we know mid + 1 > than mid so just skipping the mid
                }
            }
//        At the last , the start == end both pointing the largest number because of the above code
//        Hence both pointing same element that is max element
            return start;
        }
    static int OABS(int[] arr, int target, int start, int end){
//        int start = 0;
//        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end-start) /2;

            boolean Asc = arr[start] < arr[end];
            if (Asc) {
                if(target < arr[mid]){
                    end = mid -1;
                } else if (target > arr[mid]) {
                    start = mid +1;
                }else {
                    return  mid;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }else {
                    return  mid;
                }
            }
        }
        return -1;
    }
    }
