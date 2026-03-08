package Sorting;

public class InsertionsortAnotherMethod {
    public static void InsertinSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 1; i++) { // Traverse through 1 to n or 0 to n-1
            int j = i; // Assign i value to j
            while (j > 0 && arr[j - 1] > arr[j]) { // Compare j-1 and j index elements here j-1 is previous element and
                                                   // j is current(next) element
                // Swap arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--; // Decrease j by 1 to compare with previous elements
            }

        }
    }

    public static void main(String args[]) {
        int arr[] = { 12, 11, 13, 5, 6 };
        InsertinSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
