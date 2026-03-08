package Sorting;

public class QuickSorrt2 {
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int partition = f(arr, low, high);
            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);
        }
    }

    public static int f(int arr[], int low, int high) {
        int pivot = arr[high]; // choosing the last element as pivot
        int i = low - 1;// Here i is initialized to low-1 because we will be incrementing i before
                        // swapping
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int n = arr.length;
        quicksort(arr, 0, n - 1);
        System.out.println("Quicksort array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
