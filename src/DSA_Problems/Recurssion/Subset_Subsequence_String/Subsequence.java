package DSA_Problems.Recurssion.Subset_Subsequence_String;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
//        subseq("", "abc");
//        System.out.println(subseqRev("", "abc"));

//        subseqASCII("", "abc");

        System.out.println(subseqASCIIRev("","abc"));
    }

//    String subsets
    static void subseq(String p , String up){
//        Base Condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p,up.substring(1));
    }

//    Returning a list
static ArrayList<String> subseqRev(String p , String up){
//        Base Condition
    if(up.isEmpty()){
        ArrayList<String> list = new ArrayList<>();
        list.add(p);
        return list;
    }

    char ch = up.charAt(0);
    ArrayList<String> left = subseqRev(p + ch, up.substring(1));
    ArrayList<String> right = subseqRev(p,up.substring(1));

    left.addAll(right);
    return left;
    }


    static void subseqASCII(String p , String up){
//        Base Condition
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseqASCII(p + ch, up.substring(1));
        subseqASCII(p,up.substring(1));
        subseqASCII(p + (ch + 0) , up.substring(1));
    }


    static ArrayList<String> subseqASCIIRev(String p , String up){
//        Base Condition
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseqASCIIRev(p + ch, up.substring(1));
        ArrayList<String> second = subseqASCIIRev(p,up.substring(1));
        ArrayList<String> third = subseqASCIIRev(p+ (ch+0) , up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
