package DSA_Problems.Recurssion;

public class digit_product {
    public static void main(String[] args) {
        int ans = product(505);
        System.out.println(ans);
    }

    static  int product(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * product(n / 10);
    }
}
