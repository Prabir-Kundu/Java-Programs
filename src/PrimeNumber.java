import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number to check prime number: ");
        int number = Integer.parseInt(reader.readLine());
        int count=0;
        if (number==0 || number==1){
            System.out.println(number+" is not Prime number.");
        }else {
            for (int i = 2; i <= number; i++) {
                if (number%i == 0){
                    count++;
                }
            }
        }
        if (count == 1){
            System.out.println("The number is prime number.");
        }else {
            System.out.println("The number is not prime number.");
        }
    }
}
