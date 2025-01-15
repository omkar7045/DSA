package Recursion;

public class Factorial {
    public static int fun(int n) {
        if (n == 0) {
            return 1; 
        }
        return n * fun(n - 1); 
    }

    public static void main(String[] args) {
        int n = 4;
        int result = fun(n); 
        System.out.println(result); 
    }
}
