// public class GCDprogram {
//     public static void main(String args[]) {
//         int a = 56;
//         int b = 98;
//         while (a != b) {
//             if (a > b) {
//                 a = a - b;
//             } else {
//                 b = b - a;
//             }
//         }
//         System.out.println("GCD is: " + a);
//     }
// }

import java.util.Scanner;

public class GCDprogram {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers for getting GCD:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // Print divisors of n1
        System.out.println("Divisors of " + n1 + ":");
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Print divisors of n2
        System.out.println("Divisors of " + n2 + ":");
        for (int j = 1; j <= n2; j++) {
            if (n2 % j == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        // Find GCD using loop
        int gcd = 1;
        for (int k = 1; k <= n1 && k <= n2; k++) { // this line checking which one is minimum in both value n1 and n2
                                                   // (min value will be taken as loop limit )
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }

        System.out.println("GCD is: " + gcd);

        sc.close();
    }
}
