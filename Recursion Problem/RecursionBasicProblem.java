public class RecursionBasicProblem {
    static int count = 0;

    public static void main(String args[]) {
        // Print hello 5 times by recursion
        hello();
    }

    public static void hello() {
        if (count == 5) {
            return;
        } else {
            System.out.println("Hello");
            count++;
            hello();

        }

    }
}
