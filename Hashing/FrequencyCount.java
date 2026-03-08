package Hashing;

public class FrequencyCount {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 5, 5, 5, 5 };
        int n = arr.length;
        int[] Number = { 1, 2, 3, 4, 5 };

        for (int num : Number) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == num) {
                    count++;
                }
            }
            System.out.println("Frequency of " + num + " is: " + count);
        }
    }

}
