public class BacktrackPrintLinearly2 {
    // print Numbers from 1 to N using backtracking which means that you can't use
    // the (+) Operator
    public static void main(String args[]) {

        PrintNumber(3, 3);
    }

    public static void PrintNumber(int i, int N) {
        if (i < 1) {
            return;
        } else {
            PrintNumber(i - 1, N);
            System.out.println("number is" + " " + i);
        }
    }
}
