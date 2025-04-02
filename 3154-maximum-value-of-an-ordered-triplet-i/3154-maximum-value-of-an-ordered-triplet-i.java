class Solution {
    public long maximumTripletValue(int[] nums) {
         int i,j,k;
        int count=0;
        long ans=0;
        int n=nums.length;
        if(n==3)
        {
            long result=((long)nums[0]-(long)nums[1])*nums[2];
            if(result<0)
            return 0;
            return result;
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(nums[i]>nums[j])
                {
                
                    for(k=j+1;k<n;k++)
                    {
                        
                        ans=Math.max(ans,((long)nums[i]-(long)nums[j])*nums[k]);
                    }
                }
            }
        }
      return  ans<0? 0: ans;
        
    }
}
        
    

    
