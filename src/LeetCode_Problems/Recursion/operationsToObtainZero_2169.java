package LeetCode_Problems.Recursion;

public class operationsToObtainZero_2169 {
    public static void main(String[] args) {
        int ans = countOperations(2, 3);
        System.out.println(ans);
    }

//    Problem solution using recurssion :
//    public static int countOperations(int num1, int num2) {
//        return helper(num1,num2,0);
//    }
//
//    static int helper(int num1, int num2, int steps){
//        if(num1 == 0 || num2 == 0){
//            return steps;
//        }
//
//        if(num1 >= num2){
//            return helper(num1 - num2, num2, steps+1);
//        }
//        return helper(num1 , num2 - num1, steps+1);
//    }

    //  Problem solution using normal loops
    public static int countOperations(int num1, int num2) {
        int steps = 0;
        while (num1 != 0 && num2 != 0) {

            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            steps++;
        }
    return steps;
    }
}
