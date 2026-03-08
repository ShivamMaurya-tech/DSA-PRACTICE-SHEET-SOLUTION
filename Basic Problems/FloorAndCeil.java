import java.util.*;
import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> floorAndCeil(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();

        int floor = Math.floorDiv(a, b);
        int ceil = (int) Math.ceil((double) a / b);

        list.add(floor);
        list.add(ceil);

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  integer a:");
        int a = sc.nextInt();
        System.out.println("Enter integer b:");
        int b = sc.nextInt();
        sc.close();
        ArrayList<Integer> result = floorAndCeil(a, b);
        System.out.println(result);
    }
}
