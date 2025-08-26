package DSA_Problems.BinarySearch;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
//    Find Index = smallest number >= target
    static int ceiling(int[] arr, int target){

//        If the target is greater then the grearest number then the array
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end = arr.length-1;

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
        return start;
    }
}
