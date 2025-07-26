package DSA_Problems.BitwiseOperator_NumberSystem;

public class NoOfDigits {
    public static void main(String[] args) {
//        Complexity O(log n)
        int n = 2458;
        int b = 10;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
