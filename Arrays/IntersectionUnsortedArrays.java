package Arrays;

import java.util.HashSet;

public class IntersectionUnsortedArrays {
    public static HashSet<Integer> Intersect(int a[], int b[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : a) {
            set.add(x);
        }

        HashSet<Integer> result = new HashSet<>();
        for (int y : b) {
            if (set.contains(y)) {
                result.add(y);
                set.remove(y);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 5, 6, 7 };
        int b[] = { 1, 2, 4, 9, 3 };
        HashSet<Integer> result = Intersect(a, b);
        System.out.println("Intersection of Unsorted arrays:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
