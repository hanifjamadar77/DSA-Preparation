package DSA_Problems.Recurssion;

//import netscape.security.UserTarget;

public class Reverse_the_Number {
    public static void main(String[] args) {

//        reverse(4321);
//        System.out.println(sum);
//       int ans = reverse(4321);
//        System.out.println(ans);

        System.out.println(reverse2(54321));

    }

    static int sum = 0;
    static void reverse(int n){
//        Using Recurrsion
        if(n == 0){
            return;
        }
        int rem = (n % 10);
        sum = sum * 10 + rem;
        reverse(n/10);



//  Reverse the number using Normal optimal solution
//    while(n != 0){
//        int rem = n%10;
//        sum = sum * 10 + rem;
//        n = n/10;
//    }
//    return sum;
    }


    static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    static int helper(int n, int digits ){
        if(n % 10 == 0){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n/10 , digits - 1);
    }
}
