class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int i,pos=0;
        int neg=1;
        for(i=0;i<n;i++)
        {
            if(nums[i]<0)
            {
                ans[neg]=nums[i];
                neg=neg+2;
            }
            else if(nums[i]>0)
            {
                ans[pos]=nums[i];
                pos=pos+2;
            }
        }
        return ans;
    }
}