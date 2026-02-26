package Array_Simple_questions;

import java.util.Arrays;

public class Rotate_Array_By_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
//        System.out.println(Arrays.toString(leftRotateByOne(arr)));
//        leftRotateByK(arr,3);

//        System.out.println(Arrays.toString(rightRotateByOne(arr)));
        rightRotateByK(arr,2);
    }

//    Left rotate an array by 1 position
    public static int[] leftRotateByOne(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }

//    Left rotate array by K positions
    public static void leftRotateByK(int[] arr, int k) {
        int n =  arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k , n -1);
        reverse(arr, 0 , n-1);
        System.out.println(Arrays.toString(arr));
    }

//    Right rotate an array by 1 position
    public static int[] rightRotateByOne(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        return arr;
    }



//    Right rotate an array by K position
public static void rightRotateByK(int[] arr, int k) {
    int n =  arr.length;
    k = k % n;

    reverse(arr, 0 , n-1);
    reverse(arr, 0, k - 1);
    reverse(arr, k , n -1);
    System.out.println(Arrays.toString(arr));
}

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
