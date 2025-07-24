package DSA_Problems;

public class EvenOdd_Using_Operator {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n & 1) == 1;
        }
    }

