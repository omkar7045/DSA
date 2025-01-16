//Input: n = 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

package Recursion;

public class FibonacciSeries {
    public static int fun(int n){
        if(n<=1){
            return n;
        }
        int last = fun(n-1);
        int slast = fun(n-2);

        return last + slast;

    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(fun(n));
    }
}
