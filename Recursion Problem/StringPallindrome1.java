class Stringpallindrome1 {
    public static void main(String args[]) {
        String str = "racecar";
        int n = str.length();
        System.out.print(ispallindrome(str, 0, n - 1));

    }

    public static boolean ispallindrome(String str, int s, int e) {
        if (s >= e) {
            return true;
        }
        if (str.charAt(s) != str.charAt(e)) {
            return false;
        } else {
            return ispallindrome(str, s + 1, e - 1);
        }

    }

}