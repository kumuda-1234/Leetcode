class Solution {
    public int longestSubarray(int[] arr) {
        
        int res=0;
        for(int i=0;i<arr.length;i++){
           int flag=0,count=0,right=i,sum=0;
           while(right<arr.length)
           {
            if(arr[right]==1){
            count++;
            right++;
            sum++;

           }
           else if(arr[right]==0 && flag==0){
            right++;
            flag=1;
           }
            else if(arr[right]==0){
                res=Math.max(count,res);
                break;
            }
           }
            res=Math.max(count,res);
        if(sum==arr.length) return sum-1;
        }

        return res;
    }
}