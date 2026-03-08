package Sorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // After each pass, the largest element is at the end
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        bubbleSort(arr);
        System.out.println("Array sorted is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}