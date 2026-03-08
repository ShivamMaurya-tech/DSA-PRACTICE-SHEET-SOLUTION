public class PrintLinearl2 {
    // Print Linear Numbers from N to 1Using recursion
    public static int N = 6;

    public static void PrintNumber(int i, int N) {
        if (i < 1) {
            return;
        } else {
            System.out.println(i);
            PrintNumber(i - 1, N);
        }
    }

    public static void main(String args[]) {
        PrintNumber(6, N);
    }
}