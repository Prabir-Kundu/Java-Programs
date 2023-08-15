import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number: ");
        int row = Integer.parseInt(reader.readLine());
        int i,j;
        for(i = row; i >= 0; i--){
            for (j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (j=row; j > i; j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        for(i = (row-1); i >= 0; i--){
            for (j = i; j < row; j++){
                System.out.print(" ");
            }
            for (j=0; j < i; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
