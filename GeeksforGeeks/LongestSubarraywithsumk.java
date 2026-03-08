package GeeksforGeeks;

import java.util.HashMap;

public class LongestSubarraywithsumk {
    public static int longestsubarraywithsumk(int arr[], int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int sum = 0;
        int maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum == target) {
                maxlen = i + 1;
            }
            long remaining = sum - target;
            if (m.containsKey(remaining)) {
                int startindex = m.get(remaining);
                int len = i - startindex;
                if (len > maxlen) {
                    maxlen = len;
                }

            }
            if (!m.containsKey(sum)) {
                m.put(sum, i);
            }
        }
        return maxlen;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 5, 2, 7, 1, -10 };
        int target = 15;
        System.out.println("Longest Subarray with sum K:");
        System.out.println(longestsubarraywithsumk(arr, target));
    }

}
