// Day before N days
// Difficulty: EasyAccuracy: 32.39%Submissions: 51K+Points: 2Average Time: 10m
// Given two integers d and n. Where d is the day, out of 7 days of the week, d varies from 0 to 6 as shown below.
// 0 - Sunday
// 1 - Monday
// 2 - Tuesday
// 3 - Wednesday
// 4 - Thursday
// 5 - Friday
// 6 - Saturday

// You have to return the index for the day which is n days before the given day d.

// Examples:

// Input: d = 4, n = 3
// Output: 1
// Explanation: 3 days before the 4th is 1.
// Input: d = 2, n = 19
// Output: 4
// Explanation: 19 days before the 2nd is 4.

import java.util.*;

public class DaysBeforeNDays {
    public static void main(String args[]) {

        Scanner Sc = new Scanner(System.in);
        // Date today = new Date();
        System.out.println("Enter the day (0-6):");
        int d = Sc.nextInt();
        System.out.println("Enter the number of days before:");
        int n = Sc.nextInt(); // n is the number of days before the given day d or n is the day which expells
                              // what the day after d days is.
        int x = n % 7;
        int y = d - x;
        if (y < 0) {
            // for negative value to convert into positive
            y = y + 7;

        }
        // System.out.println(y);
        // Output the day before n days from day d
        // System.out.println("The day before " + n + " days from day " + d + " is: " +
        // y);
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday" };
        System.out.println("Which is a " + days[y]);
        // System.out.println("Today is: " + today + y);
        Sc.close();

    }

}
