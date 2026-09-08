package Top_50_Most_Asked_Questions.String;

// Count Vowels and Consonants

// Check whether it is an alphabet.
// Check whether it is a vowel.
// Otherwise, it is a consonant.

// Time:  O(n)
// Space: O(n)

public class Count_Vowels_and_Consonants {
    public static void countVowelsAndConsonants(String str){
        int vowels = 0;
        int consonants = 0;

        // Convert to lowercase so that
        // we don't need separate checks for A/E/I/O/U
        str = str.toLowerCase();

        // Traverse every character
        for(int i = 0; i<str.length(); i++) {

            char ch = str.charAt(i);

            // Process only alphabets
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    // Any other alphabet is a consonant
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }

    public static void main(String[] args) {
        countVowelsAndConsonants("Hello World");
    }
}
