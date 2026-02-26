package Array_Simple_questions;

// Check if array is sorted

public class Check_Array_Sorted {
    public static void main(String[] args) {
        int[] arr = {5,2,0,1};
        System.out.println(check(arr));
    }

    public static boolean check(int[] arr) {
        boolean flag = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
            }
        }
        return flag;
    }
}
