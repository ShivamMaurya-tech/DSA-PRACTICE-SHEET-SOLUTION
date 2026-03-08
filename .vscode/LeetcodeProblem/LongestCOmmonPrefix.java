package LeetcodeProblem;

public class LongestCOmmonPrefix {

    public static void main(String args[]) {
        String[] strs = { "flower", "flow", "flight" };
        String prefix = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + prefix);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];// initial prefix set to the first string
        // for traversing the array
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {// indexof() method returns the index within this string of the first
                                                  // occurrence of the specified substring.
                prefix = prefix.substring(0, prefix.length() - 1);// substring return a new string without modifying the
                                                                  // original string it is used for extracting a part of
                                                                  // the string i.e characters from start index to end
                                                                  // index

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}
