class Solution {
    public int subtractProductAndSum(int n) {
        int rem,pro=1,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            pro=pro*rem;
            n=n/10;
        }
        return (pro-sum);
    }
}