package Arrays;

import java.util.ArrayList;

public class AlternatePositiveNegativeNumber {
    public static ArrayList<Integer> alternatenumber(int arr[]) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);

            } else {
                neg.add(arr[i]);
            }
        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index++] = pos.get(i);
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index++] = neg.get(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            result.add(num);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 3, -4, 5, 6 };
        System.out.println("Alternate number are :");
        alternatenumber(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
