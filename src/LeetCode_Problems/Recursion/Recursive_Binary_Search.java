package LeetCode_Problems.Recursion;


public class Recursive_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {-2,-1,3,4,5,10,20,30};
        int target = 30;
//        int ans = binarySearch(arr, target);
        int ans = RecursiveBinarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

//    static int binarySearch(int[] arr, int target){
//        int start=0;
//        int end = arr.length-1;
//
////        Find the Mid element
//        while (start <= end){
//            int mid = start + (end-start) /2;
//
//            // Checks Every conditions
//            if(target < arr[mid]){
//                end = mid -1;
//            } else if (target > arr[mid]) {
//                start = mid +1;
//            }else {
//                return  mid;
//            }
//
//        }
//        return -1;
//    }



    static int RecursiveBinarySearch(int[] arr , int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                return RecursiveBinarySearch(arr, target, start, mid - 1);
            } else {
                return RecursiveBinarySearch(arr, target, mid + 1, end);
            }
        }
        return -1;
    }
}

