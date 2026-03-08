package LeetcodeProblem;

import java.util.ArrayList;

public class MajorityElement {
    public static int majority(int arr[]) {
        ArrayList<Integer> m = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            m.add(arr[i]);
        }

        for (int num : m) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }

            }
            if (count > n / 2) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 8, 8, 7, 7, 7 };
        System.out.println("Majority Element is:");
        int result = majority(arr);
        System.out.println(result);
    }

}
