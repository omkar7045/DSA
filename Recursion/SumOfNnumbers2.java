package Recursion;

public class SumOfNnumbers2 {
    public static int fun(int n) {
        if (n == 0) {
            return 0; 
        }
        return n + fun(n - 1); 
    }

    public static void main(String[] args) {
        int n = 3;
        int result = fun(n); 
        System.out.println(result); 
    }
}

