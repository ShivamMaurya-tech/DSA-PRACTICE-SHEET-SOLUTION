//find the indexOf first occurences in a string
package LeetcodeProblem;

class IndexOfFirstOccurence {
    public static void main(String args[]) {
        String haystack = "sadhtml";
        String needle = "sad";

        System.out.print(OccurenceString(haystack, needle));

    }

    public static int OccurenceString(String full, String half) {
        int n = full.length();
        int m = half.length();
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j < m && full.charAt(i + j) == half.charAt(j)) {
                j++;
            }
            if (j == m)
                return i;
        }
        return -1;
    }

}