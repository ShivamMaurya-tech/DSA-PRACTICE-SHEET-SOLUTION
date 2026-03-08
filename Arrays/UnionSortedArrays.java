package Arrays;

import java.util.*;

public class UnionSortedArrays {

    public static ArrayList<Integer> Union(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements of first array
        for (int num : a) {
            set.add(num);
        }

        // Add elements of second array
        for (int num : b) {
            set.add(num);
        }

        // Convert set to list and sort
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);

        return result;
    }

    // Time & Space Complexity

    // Time: O((n + m) log(n + m)) (because of sorting)

    // Space: O(n + m)

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 2, 3, 5, 6, 7 };

        ArrayList<Integer> union = Union(a, b);

        System.out.println("Union of Sorted Arrays:");
        for (int num : union) {
            System.out.print(num + " ");
        }
    }
}
