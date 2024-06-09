public class uniquePaths {
    static int findPaths(int[][] arr, int r, int c ){
        int[][] dp = new int[r][c];
        for(int i=0;i<r;i++){
            dp[0][i]= 1;
        }
        for(int i=0;i<c;i++){
            dp[i][0] = 1;
        }
        for(int i=1;i<r;i++){
            for(int j =1;j<c;j++){
                dp[i][j] = dp[i-1][j] + dp[j-1][i]% 1000000007;
            }
        }
        return dp[r-1][c-1];
    }
}
