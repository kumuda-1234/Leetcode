class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int pairs=len/2;
        int count=0;
        for(int i=0;i<len-1;i=i+2)
        {
            if(nums[i]==nums[i+1])
            count++;

        }
        if(count>=pairs)
        return true;
        return false;

        
    }
}