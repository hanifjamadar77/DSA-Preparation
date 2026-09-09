package Top_50_Most_Asked_Questions.Array;

// Find the Smallest Element in an Array
// Time:  O(n)
// Space: O(1)

public class Smallest_Element_in_Array {
    public static int findSmallest(int[] arr){
        // Assume first element is smallest
        int min = arr[0];

        for(int i = 0; i< arr.length; i++){
            // Update min if smaller element is found
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 15};

        System.out.println(findSmallest(arr)); // 5
    }
}
