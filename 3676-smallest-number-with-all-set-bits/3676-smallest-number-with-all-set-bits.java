class Solution {
    public int smallestNumber(int n) {
        int k=1;
        int i;
        while(k<n)
        {
            i=1<<k;
            if((i-1)>=n)
            return i-1;
            k++;
        }
        return (1<<k)-1;
    }
}