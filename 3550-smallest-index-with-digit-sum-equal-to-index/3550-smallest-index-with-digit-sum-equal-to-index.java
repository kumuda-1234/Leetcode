class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(i==sum(nums[i]))
            return i;
        }
        return -1;
    }
     public int sum(int num)
     {
        int s=0;
        int rem;
        while(num>0)
        {
            rem=num%10;
            s=s+rem;
            num=num/10;

        }
        return s;
     }
}