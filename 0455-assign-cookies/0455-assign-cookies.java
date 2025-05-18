class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i,j;
        i=0;
        j=0;
       int count=0;
       int n1=g.length;
       int n2=s.length;
       int max=0;

       while(i<n1 && j<n2)
       {
         if(s[j]>=g[i])
         {
            i++;
            j++;
            count++;
         }
         else
         j++;
         max=Math.max(max,count);
       }
         return max;
        
    }
}