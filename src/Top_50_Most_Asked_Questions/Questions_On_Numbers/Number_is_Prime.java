package Top_50_Most_Asked_Questions.Questions_On_Numbers;

// Check if a Number is Prime

// Time: O(√n)
// Space: O(1)

// Why i * i <= n?

// If n has a factor greater than √n, it must also have a factor smaller than √n.

public class Number_is_Prime {

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        if(num == 2){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }

        for(int i = 3; i * i <= num; i+= 2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17)); // true
        System.out.println(isPrime(18)); // false
    }
}
