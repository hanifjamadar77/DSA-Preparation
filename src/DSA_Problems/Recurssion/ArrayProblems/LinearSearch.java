package DSA_Problems.Recurssion.ArrayProblems;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10,3};
//        System.out.println(find(arr, 10, 0));
//        System.out.println(findIndex(arr, 10, 0));
//        System.out.println(findIndexInLast(arr, 3, arr.length - 1));
//        findIndexAll(arr,3, 0);
//        System.out.println(list);

//        System.out.println(findIndexAll(arr, 3,0, new ArrayList<Integer>()));

        System.out.println(findIndexAll2(arr, 3,0));
    }

    static boolean find(int[] arr, int target, int index){
//        base condition
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index){
//        base condition
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findIndex(arr, target, index + 1);
    }


    static int findIndexInLast(int[] arr, int target, int index) {
//        base condition
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexInLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new  ArrayList<>();
    static void findIndexAll(int[] arr, int target, int index) {
//        base condition
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findIndexAll(arr, target, index + 1);
    }

    static ArrayList<Integer> findIndexAll(int[] arr, int target, int index, ArrayList<Integer> list) {
//        base condition
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
       return findIndexAll(arr, target, index + 1, list);
    }


//List Without passing the arguments
    static ArrayList<Integer> findIndexAll2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
//        base condition
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans =  findIndexAll2(arr, target, index + 1);

        list.addAll(ans);
        return list;
    }
}
