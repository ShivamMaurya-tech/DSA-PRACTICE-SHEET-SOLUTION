package Sorting;

public class QuickSort {
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int partition = f(arr, low, high);
            quicksort(arr, low, partition - 1);
            quicksort(arr, partition + 1, high);
        }
    }

    public static int f(int arr[], int low, int high) {
        int pivot = arr[low]; // choosing the first element as pivot
        int i = low;
        int j = high;
        while (i < j) {

            while (arr[i] <= pivot && i <= high - 1) {// this line represents the left pointer movement which stops when
                                                      // it finds an element greater than pivot
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) { // this line represents the right pointer movement which stops
                                                     // when it finds an element smaller than pivot
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);// element will be swap if j crossed low that is i from the first element then
                          // return j
        return j;

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
