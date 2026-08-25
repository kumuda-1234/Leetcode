class Solution {
    public int findDuplicate(int[] nums)
    {
        int slow=nums[0];
        int fast=nums[0];
        //when slow and fast meet at a point stop the race
        do
        {
          slow=nums[slow];
          fast =nums[nums[fast]];
        }while(slow!=fast);
        slow = nums[0];
        while(slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}