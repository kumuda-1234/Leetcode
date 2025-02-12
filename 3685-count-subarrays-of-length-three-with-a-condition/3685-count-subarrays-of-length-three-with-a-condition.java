class Solution {
    public int countSubarrays(int[] nums) {
        int i,count=0;
        for(i=1;i<nums.length-1;i++)
        {
            if((nums[i-1]+nums[i+1])*2==nums[i])
            count++;
        }
        return count;
        
    }
}