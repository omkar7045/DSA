package Practice;

public class palindrome {
    public static void main(String[] args) {
        int rem;
        int rev = 0;
        int no = 121;
        int temp = no;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (no == rev) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
