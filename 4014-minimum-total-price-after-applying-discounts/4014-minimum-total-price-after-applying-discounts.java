class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double sum=0;
        int i,j;
        for( i=prices.length-1,j=discounts.length-1;i>=0&&j>=0;i--,j--)
            {
                double val=(double)(prices[i]*(100-discounts[j]))/100;
                sum=sum+val;
            }
        while(i>=0)
            {
                sum=sum+prices[i];
                i--;
            }
        return sum;
    }
}