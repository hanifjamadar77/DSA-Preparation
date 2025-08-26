package DSA_Problems.Recurssion.Subset_Subsequence_String;

import java.util.ArrayList;

public class DisePosibility {
    public static void main(String[] args) {
//        dise("",4);
//        System.out.println(diseList("", 4));

        System.out.println(diseListFase("", 4, 3));
    }

    static void dise(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            dise(p + i, target - i);
        }
    }

    static ArrayList<String> diseList(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            ans.addAll(diseList(p + i, target - i));
        }
        return ans;
    }



    static ArrayList<String> diseListFase(String p, int target, int fase){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1; i <= fase && i <= target; i++){
            ans.addAll(diseListFase(p + i, target - i, fase));
        }
        return ans;
    }
}

