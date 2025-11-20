class Solution {
    public int minimumDistance(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                if(nums[i]==nums[j])
                {
                    for(int k=j+1;k<nums.length;k++)
                    {
                        if(nums[j]==nums[k])
                        {
                            sum=Math.abs(i-j)+Math.abs(j-k)+Math.abs(k-i);
                            ans=Math.min(ans,sum);

                        }
                       
                    }
                
                }
                
            }
        }
        if(ans==Integer.MAX_VALUE) 
        return -1;
        return ans;
        
    }
}