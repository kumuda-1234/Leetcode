class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        int pro=1;
        int splpro=1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            count++;

        }
        if(count==nums.length)
        {
            for(int i=0;i<nums.length;i++)
            {
                ans[i]=0;
            }
            return ans;
        }
        for(int i=0;i<nums.length;i++)
        {
             pro=pro*nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            splpro=splpro*nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            ans[i]=pro/nums[i];
            if(nums[i]==0)
            {
                if(count==1)
                ans[i]=splpro;
            }
            
        }
        return ans;
       
        
    }
}