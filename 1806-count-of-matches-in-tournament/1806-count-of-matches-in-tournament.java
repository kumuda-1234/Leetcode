class Solution {
    public int numberOfMatches(int n) {
        int count=0;
        int match;
        while(n>1)
        {
          if(n%2!=0)
          {
            match=(n-1)/2;
            n=match+1;
            count=count+match;
          }
          else
          {
            match=n/2;
            n=n/2;
            count=count+match;
          }
        }
        return count;
        
    }
}