package LeetCode_Problems.Palindrome;

import java.util.Locale;

public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
//        Just starting the loop starting to ending
        while(left < right){
            // Skip characters that are not letters or digits from the left
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            // Skip characters that are not letters or digits from the right
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            // Compare lowercase versions of both characters
            while(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            // Move both pointers inward
            left ++;
            right --;
        }
    return true; // If the whole loop completes without mismatch, it's a palindrome
    }
}
