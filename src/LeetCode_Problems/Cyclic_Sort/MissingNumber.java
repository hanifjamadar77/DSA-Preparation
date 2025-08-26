package LeetCode_Problems.Cyclic_Sort;

public class MissingNumber {
    public static void main(String[] args) {

    }

   static int missingNumber(int[] arr){
        int i =0;
        while(i < arr.length) {
            int correct = arr.length;
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
//        Find Missing Number
            for(int index =0 ; index<arr.length ; index++){
                if(arr[index] != index){
                    return index;
                }
            }
            return arr.length;
        }


   static void swap(int[] arr, int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end]= temp;
    }
}