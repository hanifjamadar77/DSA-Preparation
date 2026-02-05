package DSA_IMP_PROBLEMS;

public class Permutation_In_String_567 {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidboaoo";

        System.out.println(checkInclusion(s1,s2));
    }

    public static boolean checkInclusion(String s1, String s2){
//        Check the s1 is smaller them s2
        if(s1.length() > s2.length()){
            return false;
        }

//        Create two arrays
        int[] s1Map = new int[26];
        int[] s2Map = new int[26];
//        Iterate the s1 string
        for(int i = 0; i < s1.length(); i++){
//            add the s1 elements in s1Map
            s1Map[s1.charAt(i) - 'a'] ++;
//            also create a first window for s1Map
            s2Map[s2.charAt(i) - 'a'] ++;
        }

//        Iterate the s2 string but only the window by window
        for(int i = 0; i < s2.length() - s1.length(); i++){
            if(matches(s1Map, s2Map)){
                return true;
            }
//            Sliding Window concept
            s2Map[s2.charAt(i + s1.length()) - 'a'] ++; // Adding new element in s2Map
            s2Map[s2.charAt(i) - 'a'] --; // removing left first element
        }
        return matches(s1Map, s2Map);
    }

//    Helper function which checks the both string are equal or not
    public static boolean matches(int[] s1Map, int[] s2Map){
        for(int i = 0; i < 26; i++){
            if(s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true;
    }
}
