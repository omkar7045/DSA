package Recursion;

public class SumOfNnumbers {
    public static void fun(int i, int sum){
        if (i<1) {
            System.out.println(sum);
           return; 
        }
        fun(i-1, sum+i);
    }
    public static void main(String[] args) {
        int n = 3;
        fun(n, 0);
    }
}
