package Array_Simple_questions;

// Find the second largest element

public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {3,2,4,9,10,1,5};
        System.out.println(secondLargestElement(arr));
    }

    public static int secondLargestElement(int[] arr) {
        int max = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < max) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
