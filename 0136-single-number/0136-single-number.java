class Solution {
    public int singleNumber(int[] nums) {
       int i,xr=0;
       
       for(i=0;i<nums.length;i++)
       {
        
         xr=xr^nums[i];
       } 
       return xr;
        
    }
}