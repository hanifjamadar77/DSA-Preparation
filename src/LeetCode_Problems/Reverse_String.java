package LeetCode_Problems;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        Reverse_String r = new Reverse_String();
        r.reverseString(s);
        System.out.println(Arrays.toString(s));

    }

    public void reverseString(char[] s) {
       int start = 0;
       int end = s.length-1;
       while (start < end){
//           swap(s, start, end);
           char temp = s[start];
             s[start] = s[end];
             s[end] = temp;
           start++;
           end--;
       }
    }

//    For more easy to understand just create a Swap function seperately.

//    public void swap(char[] s,int start,int end){
//        char temp = s[start];
//        s[start] = s[end];
//        s[end] = temp;
//    }
}
