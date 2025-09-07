class Solution {
    public int[] sumZero(int n) {
        int i;
        int ans[]=new int[n];
        if(n%2==0)
        {
            for(i=0;i<n-1;i=i+2)
            {
                ans[i]=i+1;
                ans[i+1]=-(i+1);
            }

        }
        else
        {
            ans[0]=0;
            for(i=1;i<n-1;i=i+2)
            { 
                ans[i]=i;
                ans[i+1]=-(i);
            }
        }
        return ans;
        
    }
}