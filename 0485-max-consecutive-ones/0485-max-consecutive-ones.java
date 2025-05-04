class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i;
        int count=0;
        int maxCount=0;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            if(nums[i]==1)
            count++;
            if(nums[i]==0)
            {
               
                count=0;
            }
             maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}