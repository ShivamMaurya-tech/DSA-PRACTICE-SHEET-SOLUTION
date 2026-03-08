package Hashing;

public class StringHashing {
    public static void main(String args[]) {
        String str = "abcabc";
        // char[] arr=str.toCharArray();

        int n = str.length();

        int count = 0;
        char c[] = { 'a', 'b', 'c' };
        for (char ch : c) {
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            System.out.println("Frequency of " + ch + " is: " + count);

        }
    }
}
