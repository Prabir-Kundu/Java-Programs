import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number: ");
        int num = Integer.parseInt(reader.readLine());
        for(int i = 0; i <= num; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
