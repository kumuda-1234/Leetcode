class Solution {
    public int maxProfit(int[] prices) {
        int dp=0;
        int max=0;
        for(int i=1;i<prices.length;i++)
        {
            dp=prices[i]-prices[i-1];
            if(dp>0)
            max=max+dp;
        }
       return max; 
    }
}