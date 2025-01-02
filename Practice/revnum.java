package Practice;

public class revnum {
    public static void main(String[] args) {
        int rem;
        int rev = 0;
        int no = 123;

        while(no != 0){
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no/10;
        }
        System.out.println(rev);
    }
}
