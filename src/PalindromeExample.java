import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number to check Palindrome: ");
        int number = Integer.parseInt(reader.readLine());
        int r,sum=0,temp;
        temp = number;
        while (number>0) {
            r = number % 10;
            sum = (sum*10)+r;
            number = number/10;
        }
        if (temp == sum)
            System.out.println("The number is palindrome.");
        else
            System.out.println("The number is not palindrome.");
    }
}
