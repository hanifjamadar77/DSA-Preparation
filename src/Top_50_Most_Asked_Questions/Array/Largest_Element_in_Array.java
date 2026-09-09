package Top_50_Most_Asked_Questions.Array;
// Find the Largest Element in an Array

// Time:  O(n)
// Space: O(1)
public class Largest_Element_in_Array {

    public static int findLargest(int[] arr){
        // Assume first element is the largest
        int max = arr[0];

        // Check remaining elements
        for(int i = 0; i< arr.length; i++){
            // Update max if current element is larger
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 30};

        System.out.println(findLargest(arr)); // 30
    }
}
