package Top_50_Most_Asked_Questions;

// Find the Nth Fibonacci Number
// Time: O(n)
// Space: O(1)

public class Nth_Fibonacci_Number {
    public static long Nth_fibo(int n){
        if(n < 0){
            System.out.println("Negative number");
        }
        if(n <= 1){
            return n;
        }

        long first = 0;
        long second = 1;
        for(int i = 2; i <= n; i++){
            long next = first +second;
            first = second;
            second = next;
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(Nth_fibo(10)); // 55
    }
}
