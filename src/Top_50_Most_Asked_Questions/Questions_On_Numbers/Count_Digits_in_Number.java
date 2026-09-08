package Top_50_Most_Asked_Questions.Questions_On_Numbers;

// Count Digits in a Number
// Approach: Repeated Division by 10
// Every time we divide an integer by 10, the last digit is removed.
// 12345 → 1234 → 123 → 12 → 1 → 0

// Time:  O(log n)
// Space: O(1)

public class Count_Digits_in_Number {
    public static int countDigits(int n){
        // Special case: 0 has one digit
        if(n == 0){
            return 1;
        }
        // Make negative number positive
        n = Math.abs(n);
        int count = 0;

        // Remove one digit at a time
        while(n > 0){
            n = n / 10;
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345)); // 5
        System.out.println(countDigits(987));   // 3
        System.out.println(countDigits(0));     // 1
    }
}

// Alternative
// Java provides:
// String.valueOf(n).length()
