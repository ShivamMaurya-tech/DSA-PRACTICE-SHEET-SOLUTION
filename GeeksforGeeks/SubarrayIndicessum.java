package GeeksforGeeks;

import java.util.ArrayList;

public class SubarrayIndicessum {
    public static ArrayList<Integer> subarraysum(int arr[], int target) {
        ArrayList<Integer> List = new ArrayList<>();
        int n = arr.length;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            while (sum > target && j <= i) {
                sum = sum - arr[j];
                j++;
            }
            if (sum == target) {
                List.add(j + 1);
                List.add(i + 1);
                return List;
            }
        }
        List.add(-1);
        return List;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 12;
        System.out.println(subarraysum(arr, target));

    }
}
