public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int i,ans=0;
        for(i=0;i<32;i++)
        {
            int bit=n&1;
            ans=(ans<<1)|bit;
            n=n>>>1;
        }
        return ans;
    }

}