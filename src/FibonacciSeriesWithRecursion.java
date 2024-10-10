import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciSeriesWithRecursion {
    static int n1 = 0, n2 = 1, n3, i=0, count=0;
    static void printFibonacci(int count){
        if (i < count) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(","+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number: ");
        count = Integer.parseInt(reader.readLine());
        System.out.print("Fibonacci Series is: ");
        System.out.print(n1+","+n2);
        printFibonacci(count);
    }
}
