package Top_50_Most_Asked_Questions.Array;

// Find the Second Largest Element in an Array
// Time:  O(n)
// Space: O(1)

public class Second_Largest_Element_in_Array {
    public static int findSecondLargest(int[] arr){

        // Need at least two elements
        if(arr.length < 2){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] > max){
                // Previous largest becomes second largest
                second_max = max;
                max = arr[i];
            }// num must be distinct from largest
            // and greater than current second largest
            else if(arr[i] > second_max && arr[i] != max) {
                second_max = arr[i];
            }
        }
        return second_max;
    }

    public static void main(String[] args) {
        int[] arr = {30, 20, 5, 8, 40};

        System.out.println(findSecondLargest(arr)); // 30
    }
}
