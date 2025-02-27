public class FactorialUsingRecursion {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        System.out.println(factorial(n - 1));
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int num = 5; // Change this to any number
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}
