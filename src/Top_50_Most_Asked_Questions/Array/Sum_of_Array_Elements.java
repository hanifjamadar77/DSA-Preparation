package Top_50_Most_Asked_Questions.Array;

// Find the Sum of Array Elements
// Time:  O(n)
// Space: O(1)

public class Sum_of_Array_Elements {
    public static long findSum(int[] arr){
        long sum = 0;
        // Add every element
        for(int num : arr){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.println(findSum(arr)); // 100
    }
}
