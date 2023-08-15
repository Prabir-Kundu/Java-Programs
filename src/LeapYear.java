import java.io.*;
public class LeapYear {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a year: ");
        int year = Integer.parseInt(reader.readLine());

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + " is a leap year.");
                else
                    System.out.println(year + " is not a leap year.");
            }
            else
                System.out.println(year + " is a leap year.");
        }
        else
            System.out.println(year + " is not a leap year.");
    }
}
