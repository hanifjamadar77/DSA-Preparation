package Top_50_Most_Asked_Questions.String;

import java.util.HashMap;
import java.util.Map;

// Time:  O(n)
// Space: O(k)

public class Count_Frequency_of_Characters {
    public static void findFrequency(String str){
        // HashMap stores:
        // character -> number of occurrences
        HashMap<Character, Integer> map = new HashMap<>();

        // Traverse every character
        for(char ch : str.toCharArray()){

            // If character already exists,
            // increase its count.
            // Otherwise, start with 1.
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // Print character frequencies
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }

    public static void main(String[] args) {
        findFrequency("hello");

//        e -> 1
//        h -> 1
//        l -> 2
//        o -> 1
    }
}
