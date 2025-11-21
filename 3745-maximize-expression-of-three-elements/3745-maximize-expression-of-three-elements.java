class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        int nxtmax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(nums[i]>=max)
            {
                nxtmax=max;
                max=nums[i];

            }
            if(nums[i]<max && nums[i]>nxtmax)
            nxtmax=nums[i];
            if(nums[i]<min)
            min=nums[i];
        }
        
        int ans=(max+nxtmax)-min;
        return ans;
 
    }
}