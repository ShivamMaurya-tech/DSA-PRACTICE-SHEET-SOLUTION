public class ReverseString {
    public static void main(String args[]) {
        String str = "HelloWorld";
        char arr[] = str.toCharArray();
        Reverse(0, arr, str.length() - 1);
        System.out.println(new String(arr));
    }

    public static void Reverse(int i, char arr[], int j) {
        if (i >= j) {
            return;
        } else {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            Reverse(i + 1, arr, j - 1);
        }

    }

}
