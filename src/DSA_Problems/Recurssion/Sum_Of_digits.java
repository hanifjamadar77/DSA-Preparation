package DSA_Problems.Recurssion;

import javax.xml.bind.SchemaOutputResolver;

public class Sum_Of_digits {
    public static void main(String[] args) {
//        int ans = sum(1234);
//        System.out.println(ans);
    }

    static  int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n / 10);
    }
}
