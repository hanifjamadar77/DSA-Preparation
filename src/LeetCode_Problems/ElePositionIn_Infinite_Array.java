package LeetCode_Problems;

public class ElePositionIn_Infinite_Array {
    public static void main(String[] args) {
        int[] arr ={3,5,7,9,10,50,60,80,100,150,200,230};
        int target = 10;
        System.out.println(ans(arr, target));
    }
        static int ans(int[] arr, int target){
//           Find the range
//            Start with the box of size 2
            int start = 0;
            int end = 1;

//            condition for target element
            while(target > arr[end]){
                int newStart = end + 1;
//                Double the size
//                end = previous end + sizeOfbox * 2
                end = end + (end - start +1) * 2;
                start = newStart;

            }
            return binarySearch(arr, target, start, end);
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
    }
