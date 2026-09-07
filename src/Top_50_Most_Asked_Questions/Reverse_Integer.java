package Top_50_Most_Asked_Questions;

// Reverse an Integer
// Time: O(log n)
// Space: O(1)
public class Reverse_Integer {

    public static int reverse(int num){
        int reversed = 0;

        while (num != 0){
            int digit = num % 10;

            // Check for overflow before multiplying
//            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
//            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
}
