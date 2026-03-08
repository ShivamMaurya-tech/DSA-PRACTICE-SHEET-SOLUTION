public class SumOfTheNumber{

    public static void main(String args[]) {
        PrintNumber(4, 0);
    }

    public static void PrintNumber(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;

        } else {
            PrintNumber(i - 1, sum + i);
        }

    }
}
