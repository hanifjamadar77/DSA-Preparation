package DSA_Problems.Recurssion;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palandrome(1234321));
    }

    static int reverse(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n , digits);
    }

    static int helper(int n, int digits){
        if(n % 10 == 0){
            return 0;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10, digits -1);
    }

    static boolean palandrome(int n){
        return (n == reverse(n));
    }
}
