class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int res=x^y;
        while(res!=0)
        {
            res=res&(res-1);
            count++;
        }
        return count;
    }
}