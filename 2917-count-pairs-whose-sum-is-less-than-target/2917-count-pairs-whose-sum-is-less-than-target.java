class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int len=nums.size();
        int i,j,count=0;
        for(i=0;i<len-1;i++)
        {
            for(j=i+1;j<len;j++)
            if(nums.get(i)+nums.get(j)<target)
            count++;
        }
        return count;
    }
}