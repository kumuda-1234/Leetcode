class Solution {
    public int totalMoney(int n) {
        int sum=0,num=0;
        int mon=0;
        for(int i=1;i<=n;i++)
        {
            if(i%7==1)
            {
                mon=mon+1;
                num=mon;
            }
            else
            {
                num=num+1;
            }

            sum=sum+num;
        }
       return sum; 
    }
}