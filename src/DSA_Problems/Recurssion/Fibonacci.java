package DSA_Problems.Recurssion;

public class Fibonacci {
    public static void main(String[] args) {
       int ans =  fib(5);
        System.out.println(ans);
    }

    static int fib(int n){
        int firstprev = 0;
        int secondPrev =1;

        for(int i = 1; i<n ;i++){
            System.out.print(firstprev + " ");
            int current = firstprev + secondPrev;
            secondPrev = firstprev;
            firstprev = current;
        }
        return firstprev;
    }

//    static int fib(int n){
//        if(n <= 2){
//            return n;
//        }
//        return fib(n - 1) + fib(n-2);
//    }
}
