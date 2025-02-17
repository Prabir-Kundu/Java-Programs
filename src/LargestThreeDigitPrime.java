public class LargestThreeDigitPrime {
    public static void main(String[] args) {
        int largestPrime = 0;

        for (int i = 999; i >= 100; i--) { // Start from the largest 3-digit number
            System.out.println(i);
            if (isPrime(i)) {
                largestPrime = i;
                break; // Stop at the first prime found
            }
        }

        System.out.println("Largest three-digit prime number: " + largestPrime);
    }

    // Function to check if a number is prime
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

