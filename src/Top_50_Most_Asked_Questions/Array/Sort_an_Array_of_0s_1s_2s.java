package Top_50_Most_Asked_Questions.Array;

import java.util.Arrays;

// Sort an Array of 0s, 1s and 2s
// Approach: Dutch National Flag Algorithm
// Time:  O(n)
// Space: O(1)

public class Sort_an_Array_of_0s_1s_2s {
    public static void sort(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while(mid <= high){
            if(arr[mid] == 0){
                // Put 0 on the left
                swap(arr, mid, low);
                mid++;
                low++;

            } else if (arr[mid] == 1) {
                // 1 is already in the correct middle region
                mid ++;
            }else{
                // Put 2 on the right
                swap(arr, mid, high);
                high--;

                // Do NOT increment mid here.
                // The swapped value from high
                // still needs to be processed
            }
        }
    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 0, 1, 1, 2, 2]
    }
}
