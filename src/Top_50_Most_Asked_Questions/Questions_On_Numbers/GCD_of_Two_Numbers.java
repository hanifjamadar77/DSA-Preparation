package Top_50_Most_Asked_Questions.Questions_On_Numbers;

// Greatest Common Divisor (GCD)
// Approach: Euclidean Algorithm

// I use Euclid's algorithm because each iteration reduces the problem size significantly, giving O(log(min(a,b))) time.

// Time:  O(log(min(a, b)))
// Space: O(1)
public class GCD_of_Two_Numbers {
    public static int gcd(int a, int b){

        // Make numbers positive
        a = Math.abs(a);
        b = Math.abs(b);

        // Euclidean Algorithm
        // Keep replacing:
        // a -> b
        // b -> a % b
        while(b != 0){
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        // When b becomes 0, a contains the GCD
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(48,18)); // 6
        System.out.println(gcd(20, 8));  // 4
    }
}
