//Array reverse via recursion with the help of single varible pointer
public class ReverseArray {

    static int a[] = { 5, 6, 9, 2, 0 };

    public static void main(String args[]) {

        Reverse(0, a, a.length);
        for (int num : a) {
            System.out.print(num + " ");
        }

    }

    public static void Reverse(int i, int a[], int n) {
        if (i >= n / 2) {
            return;
        } else {
            swap(i, n - i - 1); // pass by value not by reference
            Reverse(i + 1, a, n);
        }
    }

    public static void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}