//Input: n = 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

package Practice;

public class FibonnaciSeries {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }

        
        int a = 0;
        int b = 1;
        int temp;
        for (int i = 0; i < n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }  
        return a;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fib(n));
    }
}
