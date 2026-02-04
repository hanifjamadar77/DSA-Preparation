package DSA_IMP_PROBLEMS;

import java.util.HashMap;
import java.util.Map;

public class Alien_Dictionary_953 {
    public static void main(String[] args) {
        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";
        System.out.println(isAlienSorted(words, order));
    }

    public static boolean isAlienSorted(String[] words, String order){
        // Create a HashMap to store the order string
        Map<Character, Integer> orderMap = new HashMap<>();

        // Add the all order string to orderMap with char and its order
        for(int i =0; i< order.length(); i++){
            orderMap.put(order.charAt(i), i);
        }

        // Check the cases
        for(int i= 0; i< words.length - 1; i++){
            for(int j = 0; j<words[i].length(); j++){
                // Case 1
                // the big word come first like (BatMan, Bat)
                if(j >= words[i+1].length()){
                    return false;
                }

                // Case2
                // If both the words are equal then compare their order
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int currentLetter = orderMap.get(words[i].charAt(j));
                    int nextLetter = orderMap.get(words[i+1].charAt(j));
                    if(nextLetter < currentLetter){
                        return false;
                    }else{
                        break;
                    }

                }
            }
        }
        return true;
    }
}
