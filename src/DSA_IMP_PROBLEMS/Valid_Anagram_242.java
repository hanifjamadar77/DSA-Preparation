// https://leetcode.com/problems/valid-anagram/description/
package DSA_IMP_PROBLEMS;

public class Valid_Anagram_242 {
    public static void main(String[] args) {
        System.out.println(isAnagram("cat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        // Check if the length of both String is not same return false, it in not anagram
        if(s.length() != t.length()){
            return false;
        }

        // Create a array of 25 charactor
        int[] charCount = new int[26];

        // Iterate the one of String
        for(int i = 0 ; i< s.length() ; i++){
            // Increment the charCount for every char of 's' string
            // Decrement the charCount for every char of 't' string
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        // Check in chatCount if find not zero return flase
        for(int count : charCount){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
