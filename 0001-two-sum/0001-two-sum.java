class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        int m=nums.length;
        int i,j;
        
        for( i=0;i<m;i++)
        {
           for(j=i+1;j<m;j++)
           {
            if(target-nums[i]==nums[j])
            return new int[] {i,j};
           } 
            
        }
        return new int[] {};
        
    }
}