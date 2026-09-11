package Top_50_Most_Asked_Questions.Array;

import java.util.Arrays;

// Move All Zeros to the End
// Time:  O(n)
// Space: O(1)
public class Move_All_Zeros_to_the_End {
    public static int moveZeros(int[] arr){
        // Position where the next non-zero
        // element should be placed
        int insertPos = 0;

        // First pass:
        // Move all non-zero elements forward
        for(int num : arr){
            if(num != 0){
                arr[insertPos++] = num;
            }
        }

        // Fill remaining positions with zero
        while(insertPos < arr.length){
            arr[insertPos++] = 0;
        }
        return insertPos;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr)); // [1, 3, 12, 0, 0]
    }
}

//        Input:
//
//        [0, 1, 0, 3, 12]
//
//        Process non-zero values:
//
//        1 → put at index 0
//
//        [1, 1, 0, 3, 12]
//
//        3 → put at index 1
//
//        [1, 3, 0, 3, 12]
//
//        12 → put at index 2
//
//        [1, 3, 12, 3, 12]
//
//        Then fill remaining positions with zero:
//
//        [1, 3, 12, 0, 0]
