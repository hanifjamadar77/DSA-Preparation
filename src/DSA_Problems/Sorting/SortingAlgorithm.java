package DSA_Problems.Sorting;

import java.util.Arrays;

public class SortingAlgorithm {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
//        bubbleSort(arr);
//        selectionSort(arr);
        insertationSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    Insertation sort
    static void insertationSort(int[] arr){
            for(int i =0; i<arr.length - 1;i++){
                for(int j = i+1; j>0; j--){
                    if(arr[j] < arr[j-1]){
                        swap(arr, j, j-1);
                    }else{
                        break;
                    }
                }
            }
    }


//  Selection Sort
    static void selectionSort(int[] arr){
        for(int i=0 ; i< arr.length; i++) {
//            Find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }



    //    Bubble Sort
    static void bubbleSort(int[] arr){
//        Run the steps n-1 times
        boolean swapped;
        for(int i = 0; i< arr.length; i++){
            swapped = false;
            for(int j= 1; j< arr.length-i; j++){
//                Swap if the item is smaller then prev item
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            If you did not swap for a partcular value of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
    }
}
