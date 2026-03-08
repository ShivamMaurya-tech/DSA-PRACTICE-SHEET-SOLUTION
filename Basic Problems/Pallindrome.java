import java.util.Scanner;

public class Pallindrome {
    public static void main(String arrgs[]) {
        System.out.println("Enter the Number the for pallindrome");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Original = n;
        int sum = 0;
        int lastdigit;
        while (n > 0) {
            lastdigit = n % 10;
            sum = (sum * 10) + lastdigit;
            n = n / 10;
        }
        if (sum == Original) {
            System.out.println("number is Pallindrome:" + sum);
        } else {
            System.out.println("number is not Pallindrome:" + sum);
        }
        sc.close();
    }
}
