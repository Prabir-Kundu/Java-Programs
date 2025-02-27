import java.util.HashSet;
//TODO: Find the intersection of two arrays.
/*
*  -> What is the different between HashSet and HashMap?
*  HashSet: Implements a collection of unique elements.
*  HashMap: Implements a key-value pair mapping.
*
*  HashSet: Does not allow duplicate elements.
*  HashMap: Does not allow duplicate keys but allows duplicate values.
*
*  HashSet: Uses a HashMap internally.
*  HashMap: Uses a hash table with buckets.
* */
public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        // Add elements of first array to the set
        for (int num : arr1) {
            set1.add(num);
        }

        // Check for intersection in the second array
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersection.add(num);
            }
        }

        // Print the intersection
        System.out.println("Intersection of the two arrays: " + intersection);
    }
}

/* TODO: Using built-in method
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {3, 4, 5, 6, 7};

        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        list1.retainAll(list2); // Keep only common elements

        System.out.println("Intersection: " + list1);
    }
}
*/
