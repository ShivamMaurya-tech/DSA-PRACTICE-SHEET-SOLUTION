import java.util.*;

public class StringPallindrome {
    // Checking String is Pallindrome or not using recursion
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
        // converting input String to String array

        int n = arr.length;
        String[] original = Arrays.copyOf(arr, n); // Make a copy of the original array
        PrintArrayReverse(0, arr, n - 1);// Printing Array (i,n-1);
        System.out.println("Reversed String is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // Check if the reversed array equals the original to determine if it's a
        // palindrome
        // boolean isPalindrome = Arrays.equals(arr, original);
        // if (isPalindrome) {
        // System.out.println("The string is a palindrome.");
        // } else {
        // System.out.println("The string is not a palindrome.");
        // }

        if (Arrays.equals(arr, original)) {
            System.out.println("String is Pallindrome");
        } else {
            System.out.println("String is not Pallindrome");
        }

        sc.close();
    }

    public static void PrintArrayReverse(int i, String arr[], int r) {
        if (i >= r) {
            return;
        } else {
            swap(i, arr, r);
            PrintArrayReverse(i + 1, arr, r - 1);
        }
    }

    public static void swap(int i, String arr[], int r) {
        String temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
    }

}
