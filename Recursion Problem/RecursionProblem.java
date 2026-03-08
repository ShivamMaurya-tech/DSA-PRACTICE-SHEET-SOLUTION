public class RecursionProblem {

    static int count = 0;

    public static void main(String args[]) {
        hello();
    }

    public static void hello() {
        if (count == 3) {
            return;
        }
        System.out.println("Hello World");
        count++;
        hello();
    }
}
