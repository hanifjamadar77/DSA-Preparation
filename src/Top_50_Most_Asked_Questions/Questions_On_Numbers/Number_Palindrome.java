package Top_50_Most_Asked_Questions.Questions_On_Numbers;

// Check if a Number is a Palindrome

// Time: O(log n)
// Space: O(1)
public class Number_Palindrome {
    public static Boolean no_palindrome(int num){
        if(num < 0){
            return false;
        }

        int original = num;
        int reversed = 0;

        while(num > 0){
            int digit = num % 10; // it takes the last digits of numbers 4, 3, 2, 1
            reversed = reversed * 10 + digit; // It pares the digits 4, 43, 432, 4321
            num /= 10; // removes the last digit from the number
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println(no_palindrome(1234)); // False
        System.out.println(no_palindrome(12321)); // True
    }
}
