package DSA_Problems.Patterns;

public class pattern_1 {
    public static void main(String[] args) {
//        pattern_one();
//        pattern_two();
//        pattern_three(5);
//        pattern_four(5);
//        pattern_five(5);
//        pattern_6(5);
//        pattern_7(5);
//        pattern_8(5);
//        pattern_9(5);

//        pattern_10(5);
//        pattern_11(4);
//        pattern_12(5);
//        pattern_13(5);
//        pattern_14(5);
        pattern_15(5);
//        pattern_16(5);
    }

   public static void pattern_one() {
        for(int i = 0; i< 4; i++){
            for(int j = 0 ; j<4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_two() {
        for(int i = 1; i<=5; i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int pattern_three(int n) {
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public static void pattern_four(int n) {
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_five(int n) {
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_6(int n) {
        for(int i = 1; i<=n; i++){
            for(int j = 1 ; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_7(int n) {
        for(int i = 0; i<n ; i++){
//            Space
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

//            Star
            for(int j = 0 ; j<2*i+1; j++){
                System.out.print(" *");
            }
//            Space
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern_8(int n) {
        for(int i = 0; i<n ; i++){
//          Space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }

//            Star
            for(int j = 0 ; j<2*n-(2*i+1); j++){
                System.out.print(" *");
            }
//            Space
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void pattern_9(int n) {
        for(int i = 1; i<=2*n-1; i++){
            int star = i;
            if(i>n) star = 2 * n - i;
            for(int j = 1; j<=star; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_10(int n){
        int start;
        for(int i = 0 ; i<n; i++){
            if(i % 2 == 0) start = 1;
            else start = 0;

            for(int j = 0 ; j<=i; j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void pattern_11(int n){
        int space = 2 * (n-1);
        for(int i = 1; i<=n; i++){
//            Numbers
            for(int j = 1 ; j<=i; j++){
                System.out.print(j+"");
            }
//            Space
            for(int j = 1 ; j<=space; j++){
                System.out.print(" ");
            }

//            Numbers
            for(int j = i ; j>=1; j--){
                System.out.print(j+"");
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void pattern_12(int n){
        int num = 1;
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    public static void pattern_13(int n){
        for(int i = 0; i<=n; i++){
            for(char ch = 'A'; ch<= 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_14(int n){
        for(int i = 0; i<=n; i++){
            for(char ch = 'A'; ch<= 'A' + (n-i-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_15(int n){
        for(int i = 0; i<=n; i++){
            char ch = (char)('A' + i);
            for(int j = 0 ; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern_16(int n){
        for(int i = 0; i<=n; i++){
            for(char ch = 'A'; ch<= 'A' + (n-i-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

