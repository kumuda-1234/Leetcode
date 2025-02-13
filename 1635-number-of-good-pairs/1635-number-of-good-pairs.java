class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i,j;
        int count=0;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(nums[i]==nums[j]&&i<j)
                count++;
            }
        }
        return count;
        
    }
}