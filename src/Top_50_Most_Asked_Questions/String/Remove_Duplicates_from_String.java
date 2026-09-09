package Top_50_Most_Asked_Questions.String;

import java.util.HashSet;
import java.util.Set;

// Remove Duplicates from a String
// If character is not in set:
//        add it to set
//        add it to result

// Time:  O(n)
// Space: O(k)

public class Remove_Duplicates_from_String {
    public static String removeDuplicates(String str){
        // HashSet keeps track of characters
        // that we have already seen
       Set<Character> set = new HashSet<>();

        // StringBuilder stores the final result
       StringBuilder result = new StringBuilder();

        // Traverse every character
       for(char ch : str.toCharArray()){
           // add() returns true if character
           // was not already present
           if(set.add(ch)){
               // First occurrence -> keep it
               result.append(ch);
           }
           // If add() returns false,
           // the character is a duplicate,
           // so we ignore it.
       }
       return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming")); // progamin
    }
}
