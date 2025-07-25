package LeetCode_Problems.Palindrome;

public class palindrome_Number {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,3,1};
//        boolean ans = palandrome(arr);
//        System.out.println(ans);
    }


//    static boolean palandrome(int[] arr) {
//        int start = 0;
//        int end  = arr.length - 1;
//        while(start < end){
//            if(arr[start] != arr[end]){
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }


    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int start = 0;
        int end = str.length() - 1;
        while (start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
