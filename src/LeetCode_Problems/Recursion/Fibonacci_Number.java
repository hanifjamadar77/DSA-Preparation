package LeetCode_Problems.Recursion;

public class Fibonacci_Number {
    public static void main(String[] args) {
        int ans = fib(7);
        System.out.println(ans);
    }

    public static int fib(int n) {

//        Base condition
//        if(n < 2){
//            return n;
//        }
//        return fib(n- 1) + fib(n-2);


        // Solution without using Recursion
        if(n < 2) return n;
        int firstPrev = 1;
        int secondPrev = 0;
        for(int i = 2 ; i<= n; i++){
            int currentIndex = firstPrev + secondPrev;
            secondPrev = firstPrev;
            firstPrev = currentIndex;
        }
        return firstPrev;
    }
}
