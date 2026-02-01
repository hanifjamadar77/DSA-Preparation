package Striver_DSA_Sheet.Array_Part_1;

public class Pascal_Triangle {
    public static void main(String[] args) {
//        System.out.print(pascal_triangle_1(5-1, 3-1));

        pascal_triangle_2(6);

    }

//    Q1 : If they give the n and r then ask for element at that place
    public static long pascal_triangle_1(int n, int r){

        long res = 1;
        for(int i =0; i<r ; i++){
            res = res * (n-i);
            res = res / (i + 1);
        }
        return res;
    }

//    Q2 : If they ask for Nth row of pascal tree
    public static void pascal_triangle_2(int n){
        int ans = 1;

        for (int i = 1; i<n; i++){
            ans = ans * (n - i);
            ans = ans / (i);
            System.out.print(ans + " ");
        }
    }

//    Q3 : Given n print entire Triangle
}
