class Solution {
    public int findFinalValue(int[] nums, int original) {
        int ans=isFound(nums,original);
        return ans;
       
    }
    int isFound(int nums[],int original)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==original)
            {
                original=2*original;
                original=isFound(nums,original);
            }
        }
        return original;
    }
}