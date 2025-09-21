class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int i,j;
        for(i=0;i<n;i++)
        {
           for(j=i+1;j<=i+k&&j<n;j++)
           {
                if(nums[i]==nums[j]&&Math.abs(i-j)<=k)
                {
                    return true;
                }
               
            }
        }
       return false;
    }
}
