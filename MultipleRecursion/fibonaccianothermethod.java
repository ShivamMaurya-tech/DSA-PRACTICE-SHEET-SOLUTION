package MultipleRecursion;

import java.util.ArrayList;

public class fibonaccianothermethod {
    public static ArrayList<Integer> generateFibonacci(int N) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = 0;
        int b = 1;
        int c = 0;// counter variable
        list.add(a);
        list.add(b);

        while (c <= N) { // [0<=8 it means terminates this loop] loop until c exceeds N which means we
                         // have generated all fibonacci Number upto n now )
            c = a + b;// (calculate next fibonacci Number)

            if (c <= N) {// [if c(1)<=N(8) then add it to the list]
                a = b; // a=1
                b = c; // b=1

                list.add(c);// [add c to the list]

                System.out.println(a + b);
            }
        }

        return list;// return the list {0,1,1,2,3,5,8}
    }

    public static void main(String args[]) {

        System.out.println(generateFibonacci(8));

    }
}
