package Top_50_Most_Asked_Questions.Questions_On_Numbers;

//Factorial of a Number

//Time: O(n)
//Space: O(1)
//
//Why iterative instead of recursive?
//
//Both take O(n) time, but iteration avoids recursive call-stack space.

public class Factorial_of_Number {

    public static long fact(int n){
//        if(n < 0){
//            System.out.println("Negative Number");
//        }
//        int result = 1;
//        for(int i = 2; i<=n ; i++){
//            result *= i;
//        }
//        return result;

//        Using Recursion
        if(n == 0 || n == 1) return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
