public class MissingNumber {
    // Method to find the missing number
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }

    // Main method to test the findMissingNumber function
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5}; // Example array with missing number 3
        int n = 5; // The size of the array should be n-1, so n is 5

        int missingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}