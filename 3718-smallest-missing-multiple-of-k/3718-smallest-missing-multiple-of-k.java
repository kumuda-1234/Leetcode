class Solution {
    public int missingMultiple(int[] nums, int k) {
        int flag=0;
        for(int i=1;i<=nums.length;i++)
        {
            flag=0;
            int num=k*i;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==num)
                {
                    flag=1;
                    break;
                }
               
            }
            if(flag==0)
                return num;
        }
        return k*(nums.length+1);
        
    }
}