package DSA_Problems.Trees;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Binary_Trees bt = new Binary_Trees();
//
//        bt.populate(scanner);
//        bt.display();

        Binary_Search_Tree tree = new Binary_Search_Tree();

        int[] nums = {0, 5, 11, 19, 35, 40, 99};
//        tree.populate(nums);
        tree.populatedSorted(nums);
        tree.display();

    }
}
