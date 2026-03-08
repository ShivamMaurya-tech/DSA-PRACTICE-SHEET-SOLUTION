public class ParameterisedSum {
    public static void main(String args[]) {
        System.out.println(PrintNumber(4));
    }

    public static int PrintNumber(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + PrintNumber(n - 1);
        }

    }
}
