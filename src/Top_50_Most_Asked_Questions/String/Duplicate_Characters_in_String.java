package Top_50_Most_Asked_Questions.String;

import java.util.HashMap;
import java.util.Map;

// Find Duplicate Characters in a String

// Time:  O(n)
// Space: O(k)
public class Duplicate_Characters_in_String {
    public static void findDuplicates(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency of every character
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch , 0) + 1);

        }

        // Step 2: Print characters
        // whose frequency is greater than 1
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(
                        entry.getKey() + "->" + entry.getValue()
                );
            }
        }
    }

    public static void main(String[] args) {
        findDuplicates("programming");  }
}
