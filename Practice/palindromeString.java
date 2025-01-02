package Practice;

public class palindromeString {
    public static void main(String[] args) {
        String str = "PIPSD";
        String NewStr = "";
        for (int i = str.length()-1; i>=0; i--) {
            NewStr = NewStr + str.charAt(i);
        }

        if(str.equals(NewStr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }

    }
}
