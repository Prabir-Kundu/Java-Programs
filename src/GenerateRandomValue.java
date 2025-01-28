import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
/**
 * Generate Random Value
 */
public class GenerateRandomValue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Min number: ");
        int min = Integer.parseInt(reader.readLine());
        System.out.print("Enter Max number: ");
        int max = Integer.parseInt(reader.readLine());
        Random randomObj = new Random();
        int random =  (int)(Math.random()*(max-min+1)+min);
        int random1 =  randomObj.nextInt(50);
        float random2 =  randomObj.nextFloat();
        double random3 =  randomObj.nextDouble();
        long random4 =  randomObj.nextLong();
        boolean random5 =  randomObj.nextBoolean();
        System.out.print("Random number (min to max): "+random);
        System.out.print("\nRandom number: "+ Math.random());
        System.out.print("\nRandom number up to 50: "+ random1);
        System.out.print("\nRandom Float number: "+ random2);
        System.out.print("\nRandom Double number: "+ random3);
        System.out.print("\nRandom Long number: "+ random4);
        System.out.print("\nRandom Boolean value: "+ random5);
        System.out.print("\nHash code: "+ randomObj.hashCode());
    }
}
