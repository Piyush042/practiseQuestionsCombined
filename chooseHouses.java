public class chooseHouses {
    static int findMaxLoot(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
        }
        return dp[n - 1];
    }
        public static void main(String[] args) {
            int[] houses = {6, 7, 1, 3, 8, 2, 5};
            System.out.println(findMaxLoot(houses));
        }

}
