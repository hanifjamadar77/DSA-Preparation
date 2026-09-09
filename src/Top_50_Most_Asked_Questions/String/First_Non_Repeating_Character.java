package Top_50_Most_Asked_Questions.String;

// Time:  O(n)
// Space: O(1)

//I use a frequency array. In the first pass I count each character, and in the second pass I traverse the string again and return the first character whose frequency is one

//if the interviewer explicitly says lowercase English letters, change 256 to 26 and use c - 'a'. That shows you are adapting the solution to the given constraints rather than using unnecessary memory

public class First_Non_Repeating_Character {
    public static char firstNonRepeating(String str){
        // Array to store frequency of each ASCII character
        int[] freq = new int[256];

        // Pass 1:
        // Count how many times each character appears
        for(char c : str.toCharArray()){
            freq[c]++;
        }
        // Pass 2:
        // Traverse from left to right so we preserve
        // the original order and find the FIRST
        // non-repeating character
        for(char c : str.toCharArray()){
            if(freq[c] == 1){
                return c;
            }
        }
        // No non-repeating character found
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("geeksforgeeks")); // f

        System.out.println(firstNonRepeating("aabb")); // blank character
    }
}
