class Solution {
    public int hammingDistance(int x, int y) {
        int count=0;
        int n=x^y;
        while (n != 0) {
            count += (n & 1); // Check the least significant bit
            n >>>= 1;         // Right shift by 1 (unsigned)
        }
        return count;
        
    }
}