class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s1=new Stack<>();
        int res[]=new int[nums.length];
        int n=nums.length;
        Arrays.fill(res,-1);
        for(int i=0;i<2*n;i++)
        {
            while(!s1.isEmpty()&&nums[i%n]>nums[s1.peek()])
            {
                res[s1.pop()]=nums[i%n];
            }
            if(i<n)
            s1.push(i);
        
        }
        return res;


        
    }
}