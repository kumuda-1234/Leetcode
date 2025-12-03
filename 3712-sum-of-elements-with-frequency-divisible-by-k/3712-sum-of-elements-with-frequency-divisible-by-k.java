
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int sum=0;
        for(int i:map.keySet())
        {
            if((map.get(i)%k)==0)
            {
                int n=map.get(i)*i;
                sum=sum+n;
                
            }

        }
        return sum;
        
    }
}