class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>(); 

        int ans = -1; 
        for(int i = 0; i < n; i++)
        {
            int key = digitsSum(nums[i]); 

            if(map.containsKey(key))
            {
                ans = Math.max(ans, map.get(key) + nums[i]);
                map.put(key, Math.max(map.get(key), nums[i]));
            } 
            else
            {
                map.put(key, nums[i]);
            }
        }
        return ans;
    }
    int digitsSum(int num) 
    {
        int sum = 0;
        while(num > 0)
        {
            sum =sum+ num % 10;
            num = num/10;
        }
        return sum;
    }
}