class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int num:nums)
        {
            int rem,count=0;
            int temp=num;
            while(num!=0)
            {
                rem=num%10;
                count++;
                num=num/10;
            }
            if(count==1)
            sum1=sum1+temp;
            else
            sum2=sum2+temp;


        }
        if(sum1==sum2)
        return false;
        return true;
        
    }
}