package Top_50_Most_Asked_Questions.String;

// Reverse the order of words, not the characters.

// First split the string into words.
// Then traverse from right to left.

// Time:  O(n)
// Space: O(n)

public class Reverse_Words_in_a_String {
    public static String reverseWords(String str){
        String[] words = str.trim().split("\\s");

        StringBuilder result = new StringBuilder();

        for(int i = words.length -1; i>=0 ; i--){
            result.append(words[i]);

            if(i != 0){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I love Java")); // Java love I

        System.out.println(reverseWords("Java is very easy")); // easy very is Java
    }
}
