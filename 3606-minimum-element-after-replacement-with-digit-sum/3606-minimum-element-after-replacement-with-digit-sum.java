class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int nums1[]=new int[n];
        int i=0;
        for(int num:nums)
        {
           int rem,sum=0;
           int dig=num;
           while(dig!=0)
           {
             rem=dig%10;
             sum=sum+rem;
             dig=dig/10;
           }
           nums1[i]=sum;
           i++;
        }
       Arrays.sort(nums1);
       return nums1[0];
        
    }
}