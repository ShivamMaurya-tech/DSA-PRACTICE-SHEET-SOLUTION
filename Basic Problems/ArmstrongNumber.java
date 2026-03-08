import java.util.*;

public class ArmstrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the number");
        int n = sc.nextInt();
        int original = n;

        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            n = n / 10;
        }
        if (sum == original) {
            System.out.println("number is Armstrong ");
        } else {
            System.out.println("number is not Armstrong");
        }
        sc.close();
    }
}
