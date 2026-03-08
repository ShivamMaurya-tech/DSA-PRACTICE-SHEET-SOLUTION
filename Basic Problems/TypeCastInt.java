import java.util.*;

public class TypeCastInt {
    public static void main(String args[]) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int S2 = Integer.parseInt(a); // use Integer.parseInt to convert String to int (known as Typecast)
        System.out.println(S2 * 2);
        sc.close();
    }
}