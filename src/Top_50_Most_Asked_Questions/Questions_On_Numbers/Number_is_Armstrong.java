package Top_50_Most_Asked_Questions.Questions_On_Numbers;

// Check if a Number is Armstrong
// Time: O(d²) with the simple power() implementation, where d is the number of digits.
// Space: O(1)

// We can improve the exponent calculation using binary exponentiation, making it O(d log d) overall, though for normal placement constraints the simple version is usually easier to explain.

public class Number_is_Armstrong {

    public static boolean armstrong(int num){
        if(num < 0){
            return false;
        }

        int original = num;
        int digits = String.valueOf(num).length();
        long sum = 1;

        for(int i = 0; i<num ; i++){
            int digit = num % 10;
            sum += power(digit , digits);
            num /= 10;
        }
        return sum == original;
    }

    // We can also create the in-built power method or create your own
    private static long power(int base, int exponent) {
        long result = 1;

        while (exponent > 0) {
            result *= base;
            exponent--;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(armstrong(153)); // True
        System.out.println(armstrong(123)); // false
    }
}
