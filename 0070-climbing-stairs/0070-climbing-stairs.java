class Solution {
    int[] tab=new int[46];
    public int climbStairs(int n) {
        
        tab[0]=1;
        tab[1]=2;
        
        for(int i=2;i<n;i++)
        {
            tab[i]=tab[i-1]+tab[i-2];
           
        }
        return tab[n-1];
        
    }
}