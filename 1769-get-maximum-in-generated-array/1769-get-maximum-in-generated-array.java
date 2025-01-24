class Solution {
    public int getMaximumGenerated(int n) {
        int nums[]=new int[n+1];
        if(n==0)
        {
            return 0;
        }
        nums[0]=0;
        nums[1]=1;
        for(int i=0;i<=n;i++)
        {
            if(2*i<=n && 2*i>=2)
            nums[2*i]=nums[i];
            if(2*i+1<=n && 2*i+1>=2)
            nums[2*i+1]=nums[i]+nums[i+1];
        
        }
        int max=0;
        for(int i=0;i<n+1;i++)
        {
            if(max<nums[i])
             max=nums[i];
        }
        return max;
    }
}