class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[]=new int[2];
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int idx=0;
        for(int i:map.keySet())
        {
            if(map.get(i)==1)
            {
                ans[idx]=i;
                idx++;

            }
            
        }
        return ans;
    }
}