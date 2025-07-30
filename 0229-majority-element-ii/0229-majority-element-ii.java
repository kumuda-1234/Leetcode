class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int count1=0;
        int count2=0;
        int cnt1=0;
        int ele1=nums[0];
        int ele2=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ele1)
            count1++;
            else if(nums[i]==ele2)
            count2++;
            else if(count1==0)
            {
                count1=1;
                ele1=nums[i];

            }
            else if(count2==0)
            {
                count2=1;
                ele2=nums[i];

            }
           else
           {
            count1--;
            count2--;
           }
        }
        int cnt2=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            if(ele1==nums[i])
            cnt1++;
            else if(ele2==nums[i])
            cnt2++;
        }
            if(cnt1>(n/3))
            {
                ans.add(ele1);
            }
            if(ele1!=ele2 && cnt2>(n/3))
            ans.add(ele2);
        
       return ans; 
    }
}