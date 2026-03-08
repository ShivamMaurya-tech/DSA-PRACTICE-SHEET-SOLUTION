import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int count = 0;

        // check divisors
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }

        // prime numbers have exactly 2 divisors: 1 and itself
        if (count == 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

        sc.close();
    }
}