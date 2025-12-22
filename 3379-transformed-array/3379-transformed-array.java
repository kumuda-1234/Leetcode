class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int res[]=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            res[i]=0;
            else if(nums[i]>0)
            {
                int index;
                index=(i+nums[i])%nums.length;
                res[i]=nums[index];
            }
            else 
            {
                 int index;
                index=(n+(i+nums[i])%n)%n;
                res[i]=nums[index];
            }

        }
      return res;  
    }
}