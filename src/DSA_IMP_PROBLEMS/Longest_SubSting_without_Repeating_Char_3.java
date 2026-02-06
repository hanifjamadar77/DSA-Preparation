package DSA_IMP_PROBLEMS;

import java.util.HashSet;

public class Longest_SubSting_without_Repeating_Char_3 {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s){
        // Sliding Window + two Pointers
        // Checking base conditions
        if(s == null || s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }

        // Creating the two pointers
        int left = 0, right = 0;
        int ans = 0;

        // Creating the hashset of character
        HashSet<Character> set = new HashSet<>();

        // Itering the right pointer
        while(right < s.length()){
            // accessing the char
            char c = s.charAt(right);
            // Check the set contains the c
            while(set.contains(c)){
                // If contains implement the sliding window
                // remove the left side repeating char and increment the left
                set.remove(s.charAt(left));
                left++;
            }
            // If not find the repeating then add in set and increment the right and ans
            set.add(c);
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
