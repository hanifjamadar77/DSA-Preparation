package DSA_Problems.BinarySearch;

public class FloorNumber {

    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
//    //    Find Index = greatest  number <= targe
    static int floor(int[] arr, int target){
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
        return end;
    }
}
