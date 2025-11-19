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
        pattern_9(5);
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
//            Space
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

}

