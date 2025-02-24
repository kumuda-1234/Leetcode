class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0)
        {
            int lb=n&1;
            int lpb=(n>>1)&1;
            if((lb^lpb)==0)
            return false;
            n=n>>1;
        }
        return true;
        
    }
}