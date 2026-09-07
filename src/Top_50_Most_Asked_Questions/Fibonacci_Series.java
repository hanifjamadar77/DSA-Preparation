package Top_50_Most_Asked_Questions;

// Generate Fibonacci Series

// Time: O(n)
// Space: O(1)
//Best interview answer: Avoid the naive recursive Fibonacci implementation because it takes O(2ⁿ) time.

public class Fibonacci_Series {

    public static void febonacci(int n){
        if(n <= 0){
            return;
        }

        long first = 0;
        long second = 1;
        for(int i = 0; i< n; i++){
            System.out.println(first + " ");

            long next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
       febonacci(10);
    }
}
