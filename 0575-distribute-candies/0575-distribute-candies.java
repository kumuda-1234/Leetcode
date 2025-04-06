class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int i,j;
        Arrays.sort(candyType);
        int n1=n/2;
        i=0;
        for(j=1;j<n;j++)
        {
            if(candyType[j]!=candyType[i])
            {
                candyType[i+1]=candyType[j];
                i++;
            }
        }
        int count=i+1;
        if(count>=n1)
        return n1;
        return count;

        
    }
}