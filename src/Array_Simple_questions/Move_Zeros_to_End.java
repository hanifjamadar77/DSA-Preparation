package Array_Simple_questions;

// Move all zeros to end

import java.util.Arrays;

public class Move_Zeros_to_End {
    public static void main(String[] args) {
        int[] arr = {4, 7, 0, 1, 0, 9, 5};
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
    }

    public static int[] moveZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return arr;
    }
}
