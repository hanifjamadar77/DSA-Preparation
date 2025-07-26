package DSA_Problems.Matrix;

import java.util.Arrays;

public class RowColMatrix {
//    when the matrix is sorted in row wise and column wise manner then use this approch
    public static void main(String[] args) {
        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static  int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length -1;

        while(r < matrix.length && c>=0){
//            If element == target -> ans found
            if(matrix[r][c] == target){
                return new int[] {r,c};
            }
//            if element is  < target -> r++
            if(matrix[r][c] < target){
                r++;
            }
//            if element is > target -> c++
            else{
                c--;
            }
        }
//        if element is not found
        return new int[] {-1,-1};
    }
}
