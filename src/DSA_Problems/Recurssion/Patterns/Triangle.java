package DSA_Problems.Recurssion.Patterns;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        normalTriangle(4, 0);
//        reverseTriangle(4,0);
        int[] arr = {2,1,5,4,7};
//        bubbleSort(arr,arr.length - 1 , 0);
//        System.out.println(Arrays.toString(arr));

        selectionSort(arr,arr.length - 1 , 0, 0);
        System.out.println(Arrays.toString(arr));
    }


    static void normalTriangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            normalTriangle(r, c + 1);
            System.out.print("*");
        }else {
            normalTriangle(r-1, 0);
            System.out.println();
        }
    }


    static void reverseTriangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            reverseTriangle(r , c+1);
        }else{
            System.out.println();
            reverseTriangle(r - 1 , 0);
        }
    }

    static void bubbleSort(int[] arr,int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
//               Swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr, r, c+1);
        }else{
            bubbleSort(arr, r - 1 , 0);
        }
    }

    static void selectionSort(int[] arr,int r, int c , int max){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selectionSort(arr, r, c + 1, c);
            }else {
                selectionSort(arr, r, c+1, max);
            }

        }else{
//            Swap
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionSort(arr, r - 1 , 0, 0);
        }
    }
}
