package Top_50_Most_Asked_Questions.Array;

// Reverse an Array

// Time:  O(n)
// Space: O(1)

public class Reverse_an_Array {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        // Continue until pointers meet
        while(start < end){
            // Swap elements
            int temp = arr[start] ;
            arr[start] = arr[end];
            arr[end] = temp;

            // Swap elements using the addition and substraction
//            arr[start] = arr[start] + arr[end];
//            arr[end]   = arr[start] - arr[end];
//            arr[start] = arr[start] - arr[end];

            // Swap elements using the XOR operator
//            arr[start] = arr[start] ^ arr[end];
//            arr[end]   = arr[start] ^ arr[end];
//            arr[start] = arr[start] ^ arr[end];

            // Move toward the center
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 9, 20};

        reverse(arr);

        // Print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
