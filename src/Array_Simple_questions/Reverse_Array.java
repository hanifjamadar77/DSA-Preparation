package Array_Simple_questions;

import java.util.Arrays;

// Reverse an array
public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 9, 5};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return arr;
    }
}
