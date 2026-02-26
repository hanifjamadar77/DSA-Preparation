package Array_Simple_questions;

// Find the largest element in an array
public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3,2,4,20,10,1,5};
        System.out.println(largestElement(arr));
    }

    public static int largestElement(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return  max;
    }
}
