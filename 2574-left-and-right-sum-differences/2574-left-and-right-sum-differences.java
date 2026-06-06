class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int j,k;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            leftSum=0;
             rightSum=0;
            for(j=0;j<=i-1;j++ )
            leftSum+=nums[j];
            for(k=i+1;k<=nums.length-1;k++)
            rightSum+=nums[k];
            ans[i]=Math.abs(leftSum-rightSum);
        }
        return ans;


        
    }
}