package Top_50_Most_Asked_Questions.Array;

import java.util.Arrays;

// Merge Two Sorted Arrays
// Time:  O(n + m)
// Space: O(n + m)
public class Merge_Two_Sorted_Arrays {
    public static int[] merge(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        // Result array
        int[] result = new int[n + m];

        int i = 0;  // pointer for arr1
        int j = 0;  // pointer for arr2
        int k = 0;  // pointer for result

        while(i < n && j < m){
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }

// Copy remaining elements of arr1
        while(i < n){
            result[k++] = arr1[i++];
        }
// Copy remaining elements of arr2
        while(j < m){
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        System.out.println(
                Arrays.toString(merge(arr1, arr2))
        );
    }
}

