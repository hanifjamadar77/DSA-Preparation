package DSA_Problems.Recurssion.ArrayProblems;

public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,20,3,5,6,8,10};
        System.out.println(Search(arr, 8,0, arr.length-1));
    }

    static int Search(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }
            int mid = start + (end-start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target <= arr[mid] ){
                    return Search(arr, target, start, mid - 1);
                }else {
                    return Search(arr, target, mid + 1, end);
                }
            }
           if(target >= arr[mid] && target <= arr[end]){
               return Search(arr, target,mid+1, end);
           }
            return Search(arr,target,start,mid-1);
        }
    }
