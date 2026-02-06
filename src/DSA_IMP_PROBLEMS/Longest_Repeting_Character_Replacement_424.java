package DSA_IMP_PROBLEMS;

public class Longest_Repeting_Character_Replacement_424 {
    public static void main(String[] args) {
        String s = "AABABBA";
        System.out.println(characterReplacement(s, 1));
    }

    public static int characterReplacement(String s, int k) {
        // Sliding window + Two pointer
        // Create a array of 26 size to store the Input String occurance
        int[] occurance = new int[26];
        // Creating two pointers
        int left = 0, right;
        int ans = 0;
        int maxOccurance = 0;

        // Iterate the right pointer till end
        for(right = 0; right<s.length() ; right++){
            // add the right char occurance in array and store the max occurance in maxOccurance
            maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right) - 'A']);

            // Check the valid condition lenght - maxOccurance > k
            if(right - left + 1 - maxOccurance > k){
                // Implementing the sliding window to remove the left char
                occurance[s.charAt(left) - 'A']--;
                // Incremnent left by one
                left++;
            }
            // String the longest length substring in ans
            ans = Math.max(ans, right - left +1);
        }
        return ans;
    }
}
