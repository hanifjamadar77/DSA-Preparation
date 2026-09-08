package Top_50_Most_Asked_Questions.Questions_On_Numbers;

// Time:  O(√n)
// Space: O(1)

public class Number_is_Perfect {

    public static boolean perfect_no(int n){
        // Perfect numbers must be positive
        if(n <= 1){
            return false;
        }
        // 1 is always a proper divisor
        int sum = 1;
        // Check divisors only up to sqrt(n)
        for(int i = 2; i * i<= n ; i++) {
            // If i divides n, then both i and n/i are divisors
            if (n % i == 0) {
                sum += i;

                // Avoid adding the same divisor twice
                // Example: for 36, sqrt(36) = 6
                // We should not add 6 twice.
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(perfect_no(6)); // true
        System.out.println(perfect_no(28)); // true
        System.out.println(perfect_no(12)); // false
    }
}
