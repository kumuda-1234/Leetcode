class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int count=0;
        int sum=0,i;
        int cap=0;
        int len=apple.length;
        for(i=0;i<len;i++)
        sum=sum+apple[i];
        for(i=0;i<capacity.length;i++)
        cap=cap+capacity[i];
        if(sum==cap)
        return capacity.length;
        int sum1=0;
        for(i=capacity.length-1;i>=0;i--)
        {
            sum1=sum1+capacity[i];
            count++;
            if(sum<=sum1)
            {
                
                return count;
            }
        }
        return capacity.length;
        
    }
}