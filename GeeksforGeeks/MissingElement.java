package GeeksforGeeks;

public class MissingElement {
    public static int missingelement(int arr[]) {
        // code here
        long n = arr.length + 1; // long is used to avoid integer overflow for large n
        int n1 = 0;
        long sum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            n1 = n1 + arr[i];
        }

        return (int) (sum - n1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5 };
        missingelement(arr);
        System.out.println("Missing element are:");
        System.out.println(missingelement(arr));
    }
}