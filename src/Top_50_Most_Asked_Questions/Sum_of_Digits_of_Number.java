package Top_50_Most_Asked_Questions;

// Time:  O(log n)
// Space: O(1)

// n % 10 → gets last digit
// n / 10 → removes last digit
public class Sum_of_Digits_of_Number {
    public static int sumOfDigits(int num){
        // Handle negative numbers
        num = Math.abs(num);

        int sum = 0;

        // Extract digits one by one
        while(num>0){
            // Get the last digit
            int digit = num % 10;
            // Add digit to sum
            sum += digit;
            // Remove the last digit
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345)); // 15
        System.out.println(sumOfDigits(987));   // 24
    }
}

//sum = 0
//
//        12345 % 10 = 5
//         sum = 5
//        12345 / 10 = 1234
//
//        1234 % 10 = 4
//          sum = 9
//        1234 / 10 = 123
//
//        123 % 10 = 3
//          sum = 12
//        123 / 10 = 12
//
//        12 % 10 = 2
//          sum = 14
//        12 / 10 = 1
//
//        1 % 10 = 1
//          sum = 15
//        1 / 10 = 0
