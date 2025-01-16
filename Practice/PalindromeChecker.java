package Practice;



public class PalindromeChecker{
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(!Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Madam";
        boolean ans = isPalindrome(s);

        if (ans == true) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}