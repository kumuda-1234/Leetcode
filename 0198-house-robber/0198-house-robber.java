class Solution {
    int solve(int[] nums, int n, int[] dp) {
        if (n >= nums.length)
            return 0;
        if (dp[n] != -1) 
            return dp[n];
        
            int inc = nums[n] + solve(nums, n + 2, dp);
            int exc = solve(nums, n + 1, dp);
            dp[n] = Math.max(inc, exc);
            return dp[n];
        
    }

    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return solve(nums, 0, dp);
    }
}