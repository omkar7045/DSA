package Recursion;

public class PrintNameNTimes {
    public static void name(int i,int n){
        if (i>n) {
            return;
        }
        System.out.println("Omkar");
        name(i+1,n);
    }
    public static void main(String[] args) {
        int n = 4;
        name(1, n);
    }
}
