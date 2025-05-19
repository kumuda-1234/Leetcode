class Solution {
    public String triangleType(int[] nums) {
        int count=0;
        if((nums[0]+nums[1]>nums[2])&&(nums[1]+nums[2]>nums[0])&&(nums[0]+nums[2]>nums[1]))
        {
            for(int i=0;i<3;i++)
            {
                for(int j=i+1;j<3;j++)
                {
                    if(nums[i]==nums[j])
                    count++;
                }
            }
            if(count==3)
            return "equilateral";
            if(count==2||count==1)
            return "isosceles";
            return "scalene";

            
        }
        return "none";


        
    }
}