class Solution {
    public boolean isPerfectSquare(int num) {
        int i;
        int n=num/4;
        for(i=1;i<=n+1;i++)
        {
            if(i*i==num)
            return true;
        }
        return false;
        
    }
}