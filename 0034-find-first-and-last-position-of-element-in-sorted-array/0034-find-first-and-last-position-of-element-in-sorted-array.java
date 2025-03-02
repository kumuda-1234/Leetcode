class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;
        int start,end;
        start=0;
        end=nums.length-1;
        if(n==1&&nums[0]==target)
        {
            ans[0]=0;
            ans[1]=0;
            return ans;
        }
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
              int temp=mid;
              ans[0]=mid;
              while(mid-1>=0&& target==nums[mid-1])
              {
                mid=mid-1;
                ans[0]=mid;
              }
              ans[1]=temp;
              end=temp;
              while(end+1<=(n-1)&& target==nums[end+1])
              {
                end=end+1;
                ans[1]=end;
              }
              return ans;
            }
            else if(nums[mid]<target)
            start=mid+1;
            else
            end=mid-1; 
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;

        
    }
}