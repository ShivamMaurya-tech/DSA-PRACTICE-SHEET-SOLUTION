package Hashing;

import java.util.HashSet;

public class Hashset {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); // duplicate value not added
        System.out.println(set);

        // search
        if (set.contains(2))

        {
            System.out.println("2 is present");
        }
        if (!set.contains(4)) {
            System.out.println("4 is not present");
        }
        // remove
        set.remove(2);
        System.out.println(set);
        if(!set.contains(2))
        {
            System.out.println("2 is not present");
        }

    }
}
