package LeetcodeProblem;

public class Solution {

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3 };
        int n = nums.length;
        int ans[] = new int[2 * n];
        // StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        for (int i = 0; i < 2 * n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
