package Top_50_Most_Asked_Questions.Array;

// Find Missing Number in an Array
// Time:  O(n)
// Space: O(1)

public class Find_Missing_Number_in_an_Array {
    public static int findMissing(int[] arr){
       int n = arr.length + 1;

        // Start with n
       int xor = n;

        // XOR index values and array values
       for(int i = 1; i<n ; i++){
           xor = xor ^ i;
           xor = xor ^ arr[i - 1];
       }
        // The unmatched value is the missing number
       return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};

        System.out.println(findMissing(arr)); // 3
    }
}
