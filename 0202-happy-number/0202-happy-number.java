class Solution {
    public boolean isHappy(int n) {
        int rem,sum=0;
        while(true)
        {
            while(n!=0)
            {
                rem=n%10;
                sum=sum+(rem*rem);
                n=n/10;
            }
            if(sum==1)
            return true;
            if(sum==4)
            return false;
            n=sum;
            sum=0;
        }
        
        
        
    }
}