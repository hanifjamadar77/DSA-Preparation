package LeetCode_Problems.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combination_Phone_no_17 {
    public static void main(String[] args) {
//        phone("","12");
//        System.out.println(phoneRet("","12"));
        System.out.println(letterCombinations("2"));
    }


    static void phone(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for(int i = (digit-1) * 3; i< digit * 3 ; i++){
            char ch = (char)('a' + i);
            phone(p + ch, up.substring(1));
        }
    }


    static ArrayList<String> phoneRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for(int i = (digit-1) * 3; i< digit * 3 ; i++){
            char ch = (char)('a' + i);
            ans.addAll(phoneRet(p + ch, up.substring(1)));
        }
        return ans;
    }


   static  List<String> letterCombinations(String digits) {
       List<String> ans = new ArrayList<>();
       if (digits.isEmpty()) return ans;

       return helper("", digits);
    }

    static List<String> helper(String p , String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<String>();

        int digit = up.charAt(0) - '0';

        if (digit < 2 || digit > 9) return ans; // skip invalid digits

        int start = (digit - 2) * 3;
        int lettersCount = 3;

        // digit 7 has 4 letters (pqrs), digit 9 has 4 letters (wxyz)
        if (digit == 7 || digit == 9) lettersCount = 4;
        if (digit > 7) start += 1; // account for digit 7 pushing indexes by +1

        for(int i = 0; i < lettersCount; i++){
            char ch = (char)('a'+ start + i);
            ans.addAll(helper(p + ch,up.substring(1)));
        }
        return ans;
    }
}
