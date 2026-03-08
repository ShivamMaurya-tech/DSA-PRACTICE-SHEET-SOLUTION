package LeetcodeProblem;

import java.util.*;

class Patternmatching {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ");
        String s = sc.next();// String we take via input
        System.out.println("enter the Pattern");
        String p = sc.next(); // we take String as a Pattern

        sc.close();
        boolean isMatched = StringMatching(0, 0, s, p);
        System.out.println("is the String matched with Pattern : " + isMatched);
    }

    public static boolean StringMatching(int i, int j, String s, String p) {
        if (j == p.length()) {
            return i == s.length();
        }

        boolean firstMatch = (i < s.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.'));

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            // Move past '*' (zero occurrence) or use '*' (one or more occurrence)
            return StringMatching(i, j + 2, s, p) || (firstMatch && StringMatching(i + 1, j, s, p));
        } else {
            return firstMatch && StringMatching(i + 1, j + 1, s, p);
        }
    }

}
