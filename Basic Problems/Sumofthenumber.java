import java.util.*;

public class Sumofthenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        // int i = 0;
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
        sc.close();
    }
}
