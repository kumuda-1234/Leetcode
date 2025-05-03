class Solution {
    public int largestAltitude(int[] gain) {
        int curr_alt=0;
        int max_alt=0;
        for(int i:gain)
        {
            curr_alt=curr_alt+i;
            if(max_alt<curr_alt)
            max_alt=curr_alt;
        }
        return max_alt;
    }
}