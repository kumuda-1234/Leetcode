class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans=isFound(original,nums);
        return ans;
    }
   int  isFound(int original,int nums[])
   {
     for(int i=0;i<nums.length;i++)
     {
        if(nums[i]==original)
        {
            original=2*original;
             original= isFound(original,nums);

        }
    
     }
     return original;
   }

}