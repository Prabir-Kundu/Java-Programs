import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Fibonacci Series using Recursion
 * Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * In Fibonacci series, next number is the sum of previous two numbers.
 * The first two numbers of Fibonacci series are 0 and 1.
 */
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
