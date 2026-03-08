//Reversing array by pointer 
public class ArrayReversebyPointer {
    static int A[] = { 1, 2, 3, 4, 5 };

    public static void main(String args[]) {
        printNumber(0, 4);
        for (int num : A) {
            System.out.print(num + " ");
        }
    }

    public static void printNumber(int i, int r) {
        if (i > r) {
            return;
        } else {

            swap(i, r);
            printNumber(i + 1, r - 1);
        }
    }

    public static void swap(int i, int r) {
        int temp = A[i];
        A[i] = A[r];
        A[r] = temp;
    }
}
