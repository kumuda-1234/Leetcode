class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        max=Math.max(max,nums[i]);
        int[] count=new int[max+1];
       for(int i=0;i<nums.length;i++)
       {
         count[nums[i]]++;
       }
       int xor1=0;
       for(int i=0;i<count.length;i++)
       {
         if(count[i]==2)
         xor1=xor1^i;
       }
       return xor1;
    }
}