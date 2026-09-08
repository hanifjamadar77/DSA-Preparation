package Top_50_Most_Asked_Questions.String;

// Check if a String is a Palindrome

// Time: O(n)
// Space: O(1)

public class String_Palindrome {

    public static Boolean palindrome(String str){

        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("madam")); // True
        System.out.println(palindrome("Hanif")); // False
    }
}
