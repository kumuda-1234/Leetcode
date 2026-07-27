class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int pro=1;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                pro=(nums[i]-1)*(nums[j]-1);
                max=Math.max(pro,max);
            }
        }
        return max;



        
    }
}