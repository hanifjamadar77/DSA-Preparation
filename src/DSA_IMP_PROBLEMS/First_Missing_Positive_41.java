package DSA_IMP_PROBLEMS;

import java.util.HashSet;
import java.util.Set;

public class First_Missing_Positive_41 {
    public static void main(String[] args) {
       int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

//    public static int firstMissingPositive(int[] arr) {
//        Set<Integer> set = new HashSet<>();
//
//        for(int num : arr) {
//            if (num > 0) {
//                set.add(num);
//            }
//        }
//
//        int missing = 1;
//        while(set.size()>0){
//            if(!set.contains(missing)){
//                return missing;
//            }
//            missing++;
//        }
//        return missing;
//    }

    public static int firstMissingPositive(int[] arr){
        int i =0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if ( arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
//        Find Missing Number
        for(int index =0 ; index<arr.length ; index++){
            if(arr[index] != index + 1){
                return index + 1;
            }
        }
        return arr.length + 1;
    }


    static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
}
