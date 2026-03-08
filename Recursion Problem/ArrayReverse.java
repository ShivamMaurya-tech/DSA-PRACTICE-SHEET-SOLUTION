public class ArrayReverse {
    // using recursion to reversing an array
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };

        PrintArrayReverse(0, arr, 4);// Printing Array (i,n-1);
        System.out.println("Reversed Array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int i, int arr[], int r) {
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }

    public static void PrintArrayReverse(int i, int arr[], int r) {
        if (i >= r) {
            return;
        } else {
            swap(i, arr, r);
            PrintArrayReverse(i + 1, arr, r - 1);
        }
    }
}