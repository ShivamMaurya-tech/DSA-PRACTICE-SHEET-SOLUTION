import java.util.*;

public class CountNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Number");
        int n = sc.nextInt();
        Counting(n);
        System.out.println("The count of number is: " + Counting(n));
        sc.close();
    }

    public static int Counting(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}