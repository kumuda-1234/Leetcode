class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cnt=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int n1=g.length;
        int n2=s.length;
        int i=0;
        int j=0;
        while(i<n1&&j<n2)
        {
            if(s[j]>=g[i])
            {
             cnt++;
             i++;
             j++;
            }
            else
            j++;
        }

        return cnt;
    }
}