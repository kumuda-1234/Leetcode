class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int ans[]=new int[2];
        int i,j;
        int max=0, maxrow=0;
        for(i=0;i<m;i++)
        {
            int count=0;
            for(j=0;j<n;j++)
            {
             if(mat[i][j]==1)
             count++;
            }
            if(count>max)
            {
            max=count;
            maxrow=i;
            }
        }
         ans[0]=maxrow;
            ans[1]=max;
            return ans;
        
    }
}