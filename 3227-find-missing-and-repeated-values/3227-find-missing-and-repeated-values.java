 class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int ans[]=new int[2];
       
        int i,j;
        int r=grid.length;
        int c=grid[0].length;
        int n=r*c;
         int arr[]=new int[n];
         int newarr[]=new int[n];
         int index=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
               arr[index]=grid[i][j];
               index++;
            }
        }
        j=0;
        Arrays.sort(arr);
        for(i=0;i<(n)-1;i++)
        {
           if(arr[i]==arr[i+1])
           ans[0]=arr[i];
           else
           {
            newarr[j]=arr[i];
            j++;
           }
        }
        newarr[i]=arr[n-1];
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum=sum+newarr[i];

        }
       
        int totsum=n*(n+1)/2;
        int miss=totsum-sum;
        ans[1]=miss;
        return ans;
        
    }
}














     