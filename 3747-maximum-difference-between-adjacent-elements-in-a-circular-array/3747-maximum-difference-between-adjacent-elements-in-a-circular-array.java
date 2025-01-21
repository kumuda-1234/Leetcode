class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            int diff=Math.abs(nums[i]-nums[i+1]);
            if(diff>max)
            max=diff;
        }
        if(Math.abs(nums[n-1]-nums[0])>max)
        max=Math.abs(nums[n-1]-nums[0]);
        return max;
    }
}