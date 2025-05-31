class Solution {
    int[][] dp;

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        dp = new int[n][2];

        // Initialize DP table to -1 (unvisited)
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < 2; k++) {
                dp[i][k] = -1;
            }
        }

        return solve(0, n, 1, prices, fee);
    }

    int solve(int i, int n, int canBuy, int[] p, int fee) {
        if (i >= n) return 0; // No more days

        if (dp[i][canBuy] != -1) return dp[i][canBuy];

        if (canBuy == 1) {
            // Option 1: Buy
            int buy = -p[i] + solve(i + 1, n, 0, p, fee);
            // Option 2: Skip
            int notBuy = solve(i + 1, n, 1, p, fee);
            return dp[i][canBuy] = Math.max(buy, notBuy);
        } else {
            // Option 1: Sell (with fee)
            int sell = p[i] - fee + solve(i + 1, n, 1, p, fee);
            // Option 2: Hold
            int hold = solve(i + 1, n, 0, p, fee);
            return dp[i][canBuy] = Math.max(sell, hold);
        }
    }
}