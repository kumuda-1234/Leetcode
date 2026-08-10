class Solution {
    public int[] singleNumber(int[] nums) {
        int res1=0;
        for(int num:nums)
        {
            res1=res1^num;
        }
        int res2=res1&-res1;
        int a=0,b=0;
        for(int num:nums)
        {
            if((res2&num)!=0)
            a=a^num;
            else
            b=b^num;
        }
        return new int[]{a,b};
    }
}