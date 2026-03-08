package Arrays;

import java.util.*;
import java.util.ArrayList;

public class LeadersArray {
    public static ArrayList<Integer> Leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                ls.add(0, arr[i]);
                max = arr[i];
            }
        }
        Collections.sort(ls);
        return ls;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 22, 3, 12, 0, 2, 6 };
        System.out.println("Leaders element of an Array is:");
        ArrayList<Integer> leaders = Leaders(arr);
        for (int num : leaders) {
            System.out.print(num + " ");
        }
    }
}
