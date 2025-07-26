package LeetCode_Problems;

public class FlipImage_832 {
    public static void main(String[] args) {

    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
//            Reverse the array
            for(int i = 0; i< (image[0].length + 1 ) / 2; i++){
//                Swap
                int temp = row[i] ^ 1;
                row[i] = row[image.length - i - 1] ^ 1;
                row[image.length - i - 1] = temp;
            }
        }
        return image;
    }

}
