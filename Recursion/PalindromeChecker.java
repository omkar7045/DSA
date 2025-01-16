package Recursion;

public class PalindromeChecker {
    public static boolean fun(int i, String s){
        if (i>=s.length()/2) {
            return true;
        }
        if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(s.length()-i-1))){
            return false;
        }
            return fun(i+1, s);        
    }
    public static void main(String[] args) {
        String s = "Madam";
        System.out.println(fun(0, s));
    }
}
