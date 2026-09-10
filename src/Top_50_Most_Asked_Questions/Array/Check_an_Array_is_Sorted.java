package Top_50_Most_Asked_Questions.Array;

// Check if an Array is Sorted
// Time:  O(n)
// Space: O(1)

public class Check_an_Array_is_Sorted {
    public static boolean isSorted(int[] arr){
        // Compare each element with the next element
        for(int i = 0; i<arr.length-1; i++){

            // If current element is greater than next,
            // array is not sorted.
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 3, 4};

        System.out.println(isSorted(arr1)); // true
        System.out.println(isSorted(arr2)); // false
    }
}
