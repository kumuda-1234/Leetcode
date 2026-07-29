class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int idx=0;
        int i,j;
        for(i=0,j=n;i<n&&j<2*n;i++,j++)
        {
            ans[idx++]=nums[i];
            ans[idx++]=nums[j];
        }
        return ans;

        
    }
}