package Sorting;

// median element as a pivot 
public class QuickSort3 {
    // Main quicksort method that recursively sorts the array
    public static void quicksort(int arr[], int low, int high) {
        // Base case: only sort if low index is less than high index
        if (low < high) {
            // Partition the array and get the pivot index
            int partition = f(arr, low, high);
            // Recursively sort the left subarray (before pivot)
            quicksort(arr, low, partition - 1);
            // Recursively sort the right subarray (from pivot onwards)
            quicksort(arr, partition, high);
        }
    }

    // Partition function using median as pivot
    public static int f(int arr[], int low, int high) {
        // Select pivot as the middle element
        int pivot = arr[low + (high - low) / 2];
        // Left pointer starting from the beginning
        int i = low;
        // Right pointer starting from the end
        int j = high;
        // Continue until pointers cross each other
        while (i <= j) {
            // Move left pointer right until we find element >= pivot
            while (arr[i] < pivot)
                i++;
            // Move right pointer left until we find element <= pivot
            while (arr[j] > pivot)
                j--;
            // If pointers haven't crossed, swap the elements
            if (i <= j) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // Move pointers towards each other
                i++;
                j--;
            }
        }
        // Return the partition point for next recursion
        return i;
    }

    // Driver method
    public static void main(String[] args) {
        // Initialize unsorted array
        int arr[] = { 10, 7, 8, 9, 1, 5 };
        // Get array length
        int n = arr.length;
        // Call quicksort on entire array
        quicksort(arr, 0, n - 1);
        // Print result
        System.out.println("Sorted array: ");
        // Display each element in sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
