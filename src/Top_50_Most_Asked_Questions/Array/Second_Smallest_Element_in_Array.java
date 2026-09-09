package Top_50_Most_Asked_Questions.Array;

// Find the Second Smallest Element in an Array
// Time:  O(n)
// Space: O(1)
public class Second_Smallest_Element_in_Array {
    public static int findSecondSmallest(int[] arr){
        if(arr.length < 2){
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int num : arr){
            if(num < min){
                // Old smallest becomes second smallest
                second_min = min;
                min = num;
            }// Find a distinct second smallest
            else if (num < second_min && num != min) {
                second_min = num;
            }
        }
        return second_min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 5};

        System.out.println(findSecondSmallest(arr)); // 8
    }
}
