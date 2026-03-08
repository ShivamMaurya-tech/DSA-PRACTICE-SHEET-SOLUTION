package Arrays;

public class leftRotated {
    public static void Rotated(int arr[], int n) {
        int temp = arr[0];

        for (int i = 1; i < n; i++) { // Time complexity is O(n)
            // Space complexity is O(n) which is being used by the array if extra space is
            // required then O(1);
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        Rotated(arr, n);
        System.out.println(" left Rotated element are:");
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
