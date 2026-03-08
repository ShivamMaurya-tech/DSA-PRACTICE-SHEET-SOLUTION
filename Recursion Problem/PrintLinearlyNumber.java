public class PrintLinearlyNumber {
    // Print numbers from 1 to n linearly using recursion
    public static int N = 4;

    public static void PrintNumber(int i, int N) {
        if (i > N) {
            return;
        } else {
            System.out.println(i);
            PrintNumber(i + 1, N);
        }
    }

    public static void main(String args[]) {
        PrintNumber(1, N);
    }
}
