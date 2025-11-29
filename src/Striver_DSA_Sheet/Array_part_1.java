package Striver_DSA_Sheet;

public class Array_part_1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},{1,0,1},{1,1,1}
        };

        setZeroes(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }


//    Brute force
//    public static void setZeroes(int[][] matrix) {
//        // Get number of rows
//        int m = matrix.length;
//        // Get number of columns
//        int n = matrix[0].length;
//
//        // First pass: mark rows and columns
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                // If the cell is zero
//                if (matrix[i][j] == 0) {
//                    // Mark entire row as -1 (except zeros)
//                    for (int col = 0; col < n; col++) {
//                        if (matrix[i][col] != 0)
//                            matrix[i][col] = -1;
//                    }
//                    // Mark entire column as -1 (except zeros)
//                    for (int row = 0; row < m; row++) {
//                        if (matrix[row][j] != 0)
//                            matrix[row][j] = -1;
//                    }
//                }
//            }
//        }
//
//        // Second pass: replace -1 with 0
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (matrix[i][j] == -1)
//                    matrix[i][j] = 0;
//            }
//        }
//    }



//    Better approch
//    public static void setZeroes(int[][] matrix) {
//        int m = matrix.length;  // Row
//        int n = matrix[0].length; // Col
//
//        boolean[] row = new boolean[m];
//        boolean[] col = new boolean[n];
//
//        for (int i =0; i<m; i++){
//            for(int j =0; j< n; j++){
//                if(matrix[i][j] == 0){
//                    row[i] = true;
//                    col[j] = true;
//                }
//            }
//        }
//
//        for (int i =0; i<n; i++){
//            for(int j =0; j<m; j++){
//                if(row[i] || col[j]){
//                    matrix[i][j] = 0;
//                }
//            }
//        }
//    }


//    Optimal Approach
    public static void setZeroes(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;


        boolean first_row = false;
        boolean first_col = false;

//      check for Row
        for(int j = 0 ;  j < n ; j++){
            if(matrix[0][j] == 0){
                first_row = true;
                break;
            }
        }

//        check for col
        for(int i = 0 ;  i < m ; i++){
            if(matrix[i][0] == 0){
                first_col = true;
                break;
            }
        }

//        row / col
        for(int i = 0 ;  i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

//        set cells to zero based on markers
        for(int i = 0 ;  i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(matrix[i][0]==0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        if(first_row == true){
            for(int j = 0; j<n; j++ ){
                matrix[0][j] = 0;
            }
        }

        if(first_col == true){
            for(int i = 0; i<n; i++ ){
                matrix[i][0] = 0;
            }
        }
    }
}



