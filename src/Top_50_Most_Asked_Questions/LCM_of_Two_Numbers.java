package Top_50_Most_Asked_Questions;

// Find LCM of Two Numbers
// Find GCD
// use formula (a / gcd) * b
// Time:  O(log(min(a, b)))
// Space: O(1)

public class LCM_of_Two_Numbers {
//    Find the GCD
    public static int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        while(b != 0){
            int reminder = a % b;
            a = b;
            b = reminder;
        }
        return a;
    }

//    Find LCM
    public static int lcm(int a, int b){
        // If either number is 0, LCM is 0
        if(a == 0 || b == 0){
            return 0;
        }

        int gcd = gcd(a ,b);
        // Divide first to reduce overflow possibility
        return Math.abs((a / gcd) * b);
    }

    public static void main(String[] args) {
        System.out.println(lcm(12, 18)); // 36
        System.out.println(lcm(4, 6));   // 12
    }
}
