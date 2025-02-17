package PrintArrayReverse;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUsingCollections {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};

        // Using Collections.reverse
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the reversed array
        System.out.println(Arrays.toString(arr));
    }
}
