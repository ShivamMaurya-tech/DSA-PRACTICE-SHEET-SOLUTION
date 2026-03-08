public class printNames {
    public static int N = 5;
    // static int i = 0;

    public static void Name(int i, int N) {
        if (i > N) {
            return;
        } else {
            System.out.println("Shivam");

            Name(i + 1, N);
        }
    }

    public static void main(String args[]) {
        Name(1, N);
    }
}
