package com.automation.bootcamp_submission;

	public class LongestCommonSubsequence {
    // Method to find the longest common subsequence of two strings
    public static String findLCS(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();

        // Create a 2D array to store the lengths of LCS for subproblems
        int[][] dp = new int[m + 1][n + 1];

        // Build the dp array using bottom-up dynamic programming
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0; // Base case: LCS of any string with an empty string is 0
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1; // Characters match, extend the LCS
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]); // Characters don't match
                }
            }
        }

        // Reconstruct the LCS from the dp array
        int i = m, j = n;
        StringBuilder lcs = new StringBuilder();
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                // Include the matching character in the LCS
                lcs.insert(0, str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        return lcs.toString();
    }

    public static void main(String[] args) {
        String str1 = "ABCBDAB";
        String str2 = "BDCAB";

        String lcs = findLCS(str1, str2);

        System.out.println("Longest Common Subsequence: " + lcs);
    }
}

