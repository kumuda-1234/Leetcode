class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m=nums.length;
        for(int i=0;i<m;i++)
        {
            for(int j=i+1;j<m;j++)
            {
            if(target-nums[i]==nums[j])
            return new int[] {i,j};
            } 
        }
        return new int[0];
    }
}
