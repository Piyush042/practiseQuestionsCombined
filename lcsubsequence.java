public class lcsubsequence {
    static int lcs(int n, int m, String str1, String str2) {
        int[][] dp = new int[n + 1][m + 1];

        // Fill the DP table
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Print the LCS
        printLCS(dp, str1, str2, n, m);

        return dp[n][m];
    }

    static void printLCS(int[][] dp, String str1, String str2, int n, int m) {
        int i = n, j = m;
        StringBuilder lcs = new StringBuilder();

        // Reconstruct LCS from dp table
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                lcs.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Since we built lcs from the end, reverse it before printing
        System.out.println(lcs.reverse().toString());
    }

    public static void main(String[] args) {
        String str1 = "ABCBDAB";
        String str2 = "BDCAB";
        int n = str1.length();
        int m = str2.length();

        System.out.println("Length of LCS: " + lcs(n, m, str1, str2));
    }
}
