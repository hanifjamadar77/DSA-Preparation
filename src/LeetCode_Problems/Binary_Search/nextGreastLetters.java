package LeetCode_Problems.Binary_Search;

public class nextGreastLetters {
    public static void main(String[] args) {
//        char[] letters = {'c', 'f', 'j'};
        char[] letters = {'x', 'x', 'y','y'};
        char target = 'z';
        nextGreastLetters obj = new nextGreastLetters();
        System.out.println(obj.nextGreatestLetter(letters, target));
    }
    public char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end = letters.length-1;

//        Find the Mid element
        while (start <= end){
            int mid = start + (end-start) /2;

            // Checks Every conditions
            if(target < letters[mid]){
                end = mid -1;
            } else {
                start = mid +1;
            }

        }
        return letters[start % letters.length];

    }
}
