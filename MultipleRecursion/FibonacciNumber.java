package MultipleRecursion;

public class FibonacciNumber {

    public static void main(String args[]) {

        System.out.println(fibonacci(8));

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            int last = fibonacci(n - 1);
            int slast = fibonacci(n - 2);
            return last + slast;
        }
    }
}
