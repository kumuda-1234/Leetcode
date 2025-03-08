class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum=0;
        int count=0;
        long sum1=0;
        int i;
        int n=nums.length;
       for(i=0;i<n;i++)
       {
        sum=sum+nums[i];
       }
        for(i=0;i<n-1;i++)
        {
           sum1= sum1+nums[i];
            if(sum1>=sum-sum1)
            count++;
        }
        return count;


    }
}