class Solution {
    public long sumAndMultiply(int n) {
    int rev=0;
    int rem=0;
    int sum=0;
    int temp=n;
    while(temp!=0)
    {
        rem=temp%10;
        if(rem!=0)
        {
            rev=rev*10+rem;
            sum=sum+rem;

        }
        temp=temp/10;
        
    }
    int temp1=rev;
    rev=0;
    rem=0;
    while(temp1!=0)
    {
        rem=temp1%10;
        rev=rev*10+rem;
        temp1=temp1/10;
    }
     return (long)rev*sum;
        
    }
}