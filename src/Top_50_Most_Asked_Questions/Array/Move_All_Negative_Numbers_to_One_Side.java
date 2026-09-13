package Top_50_Most_Asked_Questions.Array;

import java.util.Arrays;

// Move All Negative Numbers to One Side
// Time:  O(n)
// Space: O(1)

public class Move_All_Negative_Numbers_to_One_Side {
    public static void moveNegatives(int[] arr){
        // Index where the next negative number
        // should be placed
        int position = 0;

        // Found a negative number
        for(int i = 0; i< arr.length; i++){
            if(arr[i] < 0){
                // Swap it to the negative section
                int temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;

                position++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5, -6};
        moveNegatives(arr);
        System.out.println(Arrays.toString(arr)); // [-2, -4, -6, 1, 5, 3]
    }
}
