package Top_50_Most_Asked_Questions.String;

// Check if Two Strings are Anagrams
// Time:  O(n)
// Space: O(1)
public class Check_Strings_Anagrams {
    public static boolean isAnagram(String str1, String str2){
        // If lengths differ, they cannot be anagrams
        if(str1.length() != str2.length()){
            return false;
        }

        // Frequency array for ASCII characters
        int[] frequency = new int[256];

        // Count frequencies
        for(int i = 0; i< str1.length() ; i++){
            frequency[str1.charAt(i)] ++;
            frequency[str2.charAt(i)] --;
        }

        // Check if all counts are zero
        for(int count : frequency){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true

        System.out.println(isAnagram("hello", "world")); // false
    }
}

// Step	  i str1[i]str2[i]	Action	Relevant array state
//  Start	—	—	—	all zeros	l:0, i:0, s:0, t:0, e:0, n:0
//        1	0	l	s	l++, s--	l:1, i:0, s:-1, t:0, e:0, n:0
//        2	1	i	i	i++, i--	l:1, i:0, s:-1, t:0, e:0, n:0
//        3	2	s	l	s++, l--	l:0, i:0, s:0, t:0, e:0, n:0
//        4	3	t	e	t++, e--	l:0, i:0, s:0, t:1, e:-1, n:0
//        5	4	e	n	e++, n--	l:0, i:0, s:0, t:1, e:0, n:-1
//        6	5	n	t	n++, t--	l:0, i:0, s:0, t:0, e:0, n:0

//Final check: All counts are 0 → return true ✅