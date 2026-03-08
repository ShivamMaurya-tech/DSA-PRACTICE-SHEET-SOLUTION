package Arrays;

import java.util.HashSet;

public class Sumofuniqueelement {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 3, 4 };
        int result = uniqueelement(arr);
        System.out.println("Sum of unique elements: " + result);
    }

    public static int uniqueelement(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            if (!set.contains(num)) {
                sum += num;
                set.add(num);
            }
        }
        return sum;
    }
}