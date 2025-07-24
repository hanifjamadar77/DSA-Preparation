package LeetCode_Problems;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
            int[] numbs = {12,345,2,6,7896};
        System.out.println(findNumber(numbs));

        System.out.println(digits2(548961));
    }

    static int findNumber(int[] numbs){
        int count = 0;
        for (int num : numbs){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
            int numberOfDigits = digits(num);
//            if(numberOfDigits % 2 == 0){
//                return true;
//            }
//            return false;

        return numberOfDigits % 2 == 0;
    }

//    Counts number of digits in number
    static int digits(int num){
        int count=0;

        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return -1;
        }
        while (num>0) {
            count++;
            num = num / 10;
        }
        return count;
    }

//    Short cuts to find the number of digits
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int) (Math.log10(num) + 1);
    }
}