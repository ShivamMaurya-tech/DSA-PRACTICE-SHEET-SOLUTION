import java.util.Scanner;

public class GcdEucleadianMaths {

    public static void main(String args[]) {
        System.out.println("Enter two numbers to find GCD:");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second number:");
        int b = sc.nextInt();
        sc.close();
        while (a > 0 && b > 0) { // loop runs until one number becomes zero which means gcd is found by help of
                                 // Eucleadian Maths
            if (a > b) { // for example a=56 and b=98 now gcd(56,98)=gcd(56,98-56)=gcd(56,42) now again
                         // a>b so gcd(56-42,42)=gcd(14,42) now b>a so gcd(14,42-14)=gcd(14,28) now again
                         // b>a so gcd(14,28-14)=gcd(14,14) now both are equal so gcd(14-14,14)=gcd(0,14)
                         // now a=0 so loop ends and gcd is 14

                a = a % b;
            } else {
                b = b % a;
            }
        }

        if (a == 0) {
            System.out.println("GCD is:" + b);
        } else {
            System.out.println("GCD is:" + a);
        }

    }
}
