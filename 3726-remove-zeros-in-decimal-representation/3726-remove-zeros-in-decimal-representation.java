class Solution {
    public long removeZeros(long n) {
        long rem;
        long  rev=0;
        long  temp=n;
        while(temp!=0)
        {
            rem=temp%10;
            if(rem!=0)
            rev=rev*10+rem;
            temp=temp/10;
        }
        long temp1=rev;
        long rev1=0;
        while(temp1!=0)
        {
            rem=temp1%10;
            rev1=rev1*10+rem;
            temp1=temp1/10;
        }
        return rev1; 
    }
}