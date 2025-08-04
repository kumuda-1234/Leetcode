class Solution {
    public boolean isPowerOfFour(int n) {
        double p;
        p=Math.log10(n)/Math.log10(4);
        if(p-(int)p==0)
        return true;
        return false;
        
    }
}