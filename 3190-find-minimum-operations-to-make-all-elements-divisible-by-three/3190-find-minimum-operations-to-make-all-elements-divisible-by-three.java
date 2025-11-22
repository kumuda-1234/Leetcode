class Solution {
    public int minimumOperations(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3!=0)
            {
               cnt=cnt+ischeck(nums[i]);
            }
        }  
        return cnt;  
    }
    int ischeck(int num)
    {
        int cnt=0;
        if(num%3==0)
        return cnt;
        while(num%3!=0)
        {
            int a=num+1;
            int b=num-1;
            if((num+1)%3==0)
            {
                num=num+1;
                cnt++;
            }
            if((num-1)%3==0)
            {
                num=num-1;
                cnt++;
            }
        }
        return cnt;
        
    }
}