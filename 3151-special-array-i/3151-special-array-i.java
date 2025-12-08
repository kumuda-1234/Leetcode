class Solution {
    public boolean isArraySpecial(int[] nums) {
        int i;
        int n=nums.length;
        for(i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            return false;
            if(nums[i]%2==0&&nums[i+1]%2==0)
            return false;
            if(nums[i]%2!=0&&nums[i+1]%2!=0)
            return false;

        } 
        return true;
        
    }
}