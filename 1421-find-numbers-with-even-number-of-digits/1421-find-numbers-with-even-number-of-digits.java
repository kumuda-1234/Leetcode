class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for(int num:nums)
        {
            int rem=0;
            int count=0;
            while(num>0)
            {
                rem=num%10;
                count++;
                num=num/10;
            }
            if(count%2==0)
            even++;
        }
        return even;

        
    }
}