class Solution {
    public int countOdds(int low, int high) {
        if((high-low+1)%2==0)
        {
            int count= (high-low)+1;
            return count/2;
        }
       if((low%2==0)&&(high%2==0))
       {
         int ans=(high-low)/2;
         return ans;
       }
       int res=((high-low)/2)+1;
       return res;

        
    }
}