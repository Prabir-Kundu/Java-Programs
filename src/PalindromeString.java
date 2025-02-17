import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeString {
    public static boolean isPalindrome(String s){
        String word = s.toLowerCase();
        String rev = "";
        for (int i = word.length() -1; i >= 0 ; i--) {
            rev = rev + word.charAt(i);
        }
        return word.equals(rev);
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string: ");
        String s = br.readLine();

        if (isPalindrome(s)){
            System.out.println(s+" is Palindrome.");
        } else {
            System.out.println(s+" is not Palindrome.");
        }
    }
}
