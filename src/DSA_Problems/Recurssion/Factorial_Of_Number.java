package DSA_Problems.Recurssion;

public class Factorial_Of_Number {
    public static void main(String[] args) {
        int ans = fact(0);
        System.out.println(ans);
     }

    static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

}
